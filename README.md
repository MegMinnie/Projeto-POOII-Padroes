<div align="center">
  
# Projeto-POOII-Padroes

<img src="https://img.shields.io/badge/JAVA-23.1-blue" />
<img src="https://img.shields.io/badge/LICENSE-MIT-yellow" />

</div>

## Projeto-POOII-Padroes

Este projeto é uma atividade avaliativa da disciplina de **Linguagem Orientada a Objetos II**, dando continuidade à primeira atividade, _"Sistema Escolar"_. Ele aplica conceitos de **refatoração** e incorpora os padrões de projeto **Singleton, Observer e Adapter**.

## Funcionalidades

O sistema conta com quatro menus principais:

1. **Seleção de Semestre** – Permite ao usuário escolher o semestre desejado.
2. **Escolha do Perfil** – O usuário pode optar por acessar como **professor** ou **coordenador**.
3. **Autenticação do Professor** – Caso escolha o perfil de **professor**, o sistema solicitará uma senha.
   - Se a senha for validada com sucesso, o professor terá acesso ao **menuProfessor**.
4. **Autenticação do Coordenador** – Se o usuário escolher o perfil de **coordenador**, será necessário realizar a autenticação para acessar o **menuCoordenador**.

## Menus e suas funções

### **EscolherSemestre()**

- Acessar o semestre 5
- Acessar o semestre 6

### **MenuSelecionar()**

- Escolher professor
- Escolher coordenador

### **menuProfessor()**

- Atribuir notas aos estudantes
- Mostrar a estatística
- Lista de recuperação
- Histórico

### **menuCoordenador()**

- Cadastrar um professor
- Vincular um professor a uma turma
- Cadastrar um estudante
- Vincular um estudante a uma turma
- Cadastrar um curso
- Cadastrar uma turma
- Cadastrar um coordenador
- Atribuir notas aos estudantes
- Mostrar a estatística
- Lista de recuperação
- Lista geral
- Histórico
