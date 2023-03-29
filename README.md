## Imersão Alura Java ☕

➡ Dia 1:

<ul>
<li>Nessa etapa foi utilizada a <a href="https://imdb-api.com">api do IMDB</a> requisitando o endpoint que retorna os 250 melhores filmes. Para isso foi utilizado o pacote <a href="https://docs.oracle.com/javase/7/docs/api/java/net/package-summary.html">java.net</a> que fornece todas as ferramentas para estabelecer a conexão client-server.
<li>Também foi utilizada a biblioteca Gson do google para desserializar o JSON da requisição e armazenar as informções em objetos Java.
  </ul>
  
![filmes](https://user-images.githubusercontent.com/128440501/228597678-7b7783d6-7671-4227-abd0-6e78123a4cb6.PNG)![series](https://user-images.githubusercontent.com/128440501/228597395-142d54c7-435d-4865-9f10-f0831bae1e95.PNG)</br>

➡ Dia 2:

<ul>
<li>No segundo dia foram utilizadas as imagens disponíveis nos dados da requisição (JSON) para a criação de figurinhas. Com o auxílio dos pacotes <a href="https://docs.oracle.com/javase/7/docs/api/java/awt/package-summary.html">java.awt</a>, <a href="https://docs.oracle.com/javase/7/docs/api/java/io/package-summary.html">java.io</a> e <a href="https://docs.oracle.com/javase/7/docs/api/javax/imageio/ImageIO.html">java.ImageIO</a> foi possível realizar a edição das imagens e a inserção de textos.
<li>Uma classificação simples baseada no IMDB Rating foi aplicada onde para filmes com baixa pontuação é atribuído o comentário "Mó furada pô!", para os filmes intermediários "Dá pra ir..." e os filmes de maior pontuação "Mete bronca!!". A mesma metodologia foi aplicada aos programas de Tv.
<li>Para persistência dos dados foi criada uma pasta saida/imdb onde as figurinhas geradas podem ser exportadas no formato png.
