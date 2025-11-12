# Sistema de Cadastro dos Encontros — *Mães Que Oram Pelos Filhos*

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![JDBC](https://img.shields.io/badge/JDBC-007396?style=for-the-badge&logo=java&logoColor=white)
![Swing](https://img.shields.io/badge/Java_Swing-5382A1?style=for-the-badge&logo=java&logoColor=white)
![POO](https://img.shields.io/badge/POO-007ACC?style=for-the-badge&logoColor=white)

> Projeto acadêmico desenvolvido para a disciplina de **Linguagem de Programação (LP)**  
> Professora: *Juliana Pasquini* <br>
> Alunos: *Cauã Cursino* e *Davi Andrade* <br>
> Turma: 2° ADS (2025)

---

## Sobre o Projeto

O sistema foi desenvolvido para **organizar e gerenciar os encontros das Mães Que Oram pelos Filhos**, um grupo de oração de uma paróquia.  
Permite o **cadastro de mães participantes**, o **gerenciamento dos encontros e serviços** e a **emissão de relatórios automáticos** em `.txt`.

---

## ⚙️ Funcionalidades

|  Função |  Descrição |
|:--|:--|
|  **Cadastro de Mães** | Nome, telefone, endereço e data de aniversário |
|  **Cadastro de Encontros** | Data + serviços com mães responsáveis |
|  **Serviços Fixos** | Música, Recepção, Acolhida, Terço, Formação, Momento Oracional, Proclamação da Vitória, Sorteio das Flores, Encerramento, Arrumação da Capela, Queima dos Pedidos, Compra das Flores |
|  **Edição / Exclusão de Encontros** | Apenas encontros futuros podem ser alterados; exclusão é lógica |
|  **Lista de Aniversariantes do Mês** | Exibe automaticamente as mães aniversariantes do mês atual |
|  **Relatório (.txt)** | Gera um resumo de um encontro específico com todas as responsáveis |

---

## Instalação

Para rodar o **Mães Que Oram** localmente, siga os passos abaixo:

1. **Clone o repositório**
   ```bash
   git clone https://github.com/CauaCurisno1446/Maes-Que-Oram.git
   cd Maes-Que-Oram
   ```

2. **Importe o SQL no seu servidor**
   ```bash
     sqlcmd -S nome_do_servidor -d nome_do_banco_de_dados -i maesqueoram.sql
   ```

3. **Execute o arquivo .jar**
   ```bash
     app.jar
   ```

