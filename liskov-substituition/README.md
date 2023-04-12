## L - Liskov Substituition 
![Martelo e chave juntos](imagens/single-responsibility-principle.png)

> Se para cada objeto x1 do tipo S há um objeto x2 do tipo T de tal forma que, para todos os programas P definidos em termos de T, 
> o comportamento de P não muda quando x1 é substituído por x2 então S é um subtipo de T. 

Traduzindo
As classes derivadas devem ser substituíveis por suas classes bases.


---------------
### Pode-se resumir esse princípio aos seguintes fundamentos

 - Cada entidade de software (classe ou método) deve ter apenas um único motivo para mudar
 - se uma determinada classe (ou método) fizer várias operações, é aconselhável separar em classes (ou métodos) distintas
 - Cada classe ou método lida com apenas uma única responsabilidade
 

Fonte: https://www.udemy.com/course/basics-of-software-architecture-design-in-java/learn/lecture/9592570#overview


 