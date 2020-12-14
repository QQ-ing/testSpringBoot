helm install testsb-ingress  ingress-nginx/ingress-nginx \
    --namespace business \
    --set controller.name=testsb-ingress \
    --set controller.watchNamespace=business \
    --set controller.ingressClass=testsbclass \
    --set controller.replicaCount=2 \
    --set controller.nodeSelector."beta\.kubernetes\.io/os"=linux \
    --set defaultBackend.nodeSelector."beta\.kubernetes\.io/os"=linux \
    --set rbac.create=true
