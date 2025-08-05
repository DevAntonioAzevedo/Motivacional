# Frases Motivacionais Diárias

Este é um aplicativo Android simples que exibe uma frase motivacional aleatória a cada clique de um botão. Ele foi desenvolvido como um projeto de aprendizado para praticar conceitos básicos de desenvolvimento Android com **Kotlin**, como manipulação de UI, acesso a recursos de _string_ e lógica de programação simples.

## **Funcionalidade**

- **Geração de Fraeses Aleatórias:** Exibe uma nova frase motivacional a cada toque no botão.
- **Armazenamento de Dados:** Utiliza um _array_ de _string_ nos recursos do projeto para armazenar as frases.
- **Interface Intuitiva:** _Layout_ simples e direto, focado na experiência do usuário.

## **Tecnologias Utilizadas:**

- **Linguagem:** _Kotlin_
- **IDE:** Android Studio
- **Layout:** XML com **ConstraintLayout**
- **Ferramentas:** _View Binding_ para acesso seguro aos elementos de UI.
- **Outros:** Acesso a recursos _String Arrays_

## **Como o Aplicativo Funciona:**

O aplicativo consiste em uma única tela _MainActivity_ que contém:
1. Um **TextView** para exibir a frase motivacional.
2. Um **Button** que, quando clicado, dispara a lógica de sorteio.

A lógica de sorteio é simples:
- Um _array_ de _strings_ com as frases é carregado a partir do arquivo de recursos.
- Ao clicar no botão, um índice aleatório é gerado, respeitando o tamanho do _arrya_.
- A frase correspondente a esse índice é então recuperada e exibida no _TextView_.

<img width="433" height="805" alt="Tela1" src="https://github.com/user-attachments/assets/bced63d4-e7ba-49d2-8408-59c567e283cf" />
<img width="427" height="815" alt="Tela2" src="https://github.com/user-attachments/assets/6a224d50-ba63-4ec1-a1dc-ee65e8baa786" />

## **Como Executar o Projeto:**
1. **Clone o repositório:**
   
   _Bash_
   
   _git clone https://github.com/DevAntonioAzevedo/Motivacional.git_
   
3. **Abra no Andorid Studio:** Abra a pasta do projeto no Android Studio. A IDE irá automaticamente sincronizar as dependências do _Gradle_.
4. **Execute:** Selecione um emulador ou um dispositivo Android conectado e execute o projeto.

## **Autor:**
Antônio Azevedo

## **Fonte de Aprendizado:**
**Autor:** Tiago Aguiar

**Fonte:** Esse projeto foi desenvolvido como um exercício prático com base no tutorial do _**Youtube**_ - Título do vídeo: Curso de Android com Kotlin 2025 | Para Iniciantes

_**Link:**_ http://www.youtube.com/watch?v=xCb-O3qVM5Y
