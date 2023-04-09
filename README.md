# solidify
Estudos práticos sobre os princípios SOLID

## Base para criação de projetos
 - Single Responsability Principle : srp
 - Open Closed Principle: ocp
 - Liskov Substituition Principle: lsp
 - Interface Segregation Principle: isp
 - Dependency Inversion: di

```sh
$ mvn archetype:generate \
  -DgroupId=br.com.cpdias.solid \
  -DartifactId=single-responsability \
  -Dpackage=br.com.cpdias.solid.srp \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DarchetypeVersion=1.4 \
  -DinteractiveMode=false

```

