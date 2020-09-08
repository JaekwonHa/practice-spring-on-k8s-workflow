# Kubernetes 환경에서의 spring boot 개발 workflow 익히기

* jib
* docker-credential
* cloud code
* stern
* kustomize
* skafold

```
kubectl create deployment myapp --image=hazxz/myapp --dry-run -oyaml > deployment.yaml
kubectl apply -f deployment.yaml
kubectl get all

kubectl expose -f deployment.yaml --port=80 --target-port=8080 --dry-run -oyaml > service.yaml
kubectl apply -f service.yaml
kubectl get all
kubectl port-foward pod/myapp-59cb5b9ddd-c6k68 8080:8080

curl localhost:8080/hello

skaffold init --skip-build
skaffold dev --port-forward=true
skaffold dev --port-forward=true --profile=production

kustomize edit add resource deployment.yaml
kustomize edit add resource service.yaml
kustomize build overlays/production
kustomize build overlays/production | k apply -f -
kubectl get all

kubectl delete deployment.apps/myapp
kubtctl delete service/myapp
```
