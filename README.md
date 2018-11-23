# Scala Lambda Terraform

Example AWS lambda function written in Scala and deployed with Terraform

## Build

This project is built with `sbt`

```sh
make build
```

This runs `sbt assembly` and places the jar in `target/scala-2.xx`

## Deploy

Resources are provisioned using Terraform

```sh
make deploy
```

The lambda function will now be deployed.
When a new build is made, make deploy will deploy the new build.
