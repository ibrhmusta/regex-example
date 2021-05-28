<h3>Proje <a href="https://github.com/furk2sahin"><b>Furkan Şahin</b></a> yardımı ile tüm Kodlama.io ekibi için yapılmıştır.</h3>
<h3>Kendi projenize entegre etmek için pom.xml içinde bulunan dependencies kısmına şu dependency `i ekleyelim.</h3>

    <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-validation</artifactId>
	</dependency>

<h3>Bu işlemin ardından <a href="https://github.com/ibrhmusta/regex-example/blob/master/src/main/java/regex/example/core/ExceptionHandlerClass.java"><b>ExpectonHandlerClass</b></a> sınıfımızı projemize dahil edelim. Bu sınıf içinde bulundurduğu metod sayesinde @Pattern anotasyonu içine yazdığımız formata göre kontrol ettikten sonra hata fırlatmamızı sağlıyor.</h3> 

<p align="center">
  <img src="https://github.com/ibrhmusta/regex-example/blob/master/readme-images/Ekran%20g%C3%B6r%C3%BCnt%C3%BCs%C3%BC%202021-05-28%20075602.png" width="600" alt="main">
</p>

<h3>Bu işlemin sağlanması için ise Controller tarafında parametre olarak gönderdiğimiz nesnemizin önüne @Valid anotasyonunu ekliyoruz. </h3>

<p align="center">
  <img src="https://github.com/ibrhmusta/regex-example/blob/master/readme-images/Ekran%20g%C3%B6r%C3%BCnt%C3%BCs%C3%BC%202021-05-28%20075741.png" width="600" alt="main">
</p>

 <div class="container">
        <div class="regex-item">
            <h2>Cep Telefonu Numarası</h2>
            <h3>Kabul edilen formatlar</h3>
            <p><i>05231231212<br>0523 123 12 12</i></p>
            <h3>Regex</h3>
              <pre>/^(05)([0-9]{2})\s?([0-9]{3})\s?([0-9]{2})\s?([0-9]{2})$/</pre>
            </div>
            <div class="regex-item">
                <h2>Sabit Telefonu Numarası</h2>
                <h3>Kabul edilen formatlar</h3>
                <p><i>01231231212<br>0123 123 12 12</i></p>
                <h3>Regex</h3>
                <pre>/^(0)([0-9]{3})\s?([0-9]{3})\s?([0-9]{2})\s?([0-9]{2})$/</pre>
            </div>
            <div class="regex-item">
                <h2>TC Kimlik Numarası</h2>
                <h3>Kabul edilen formatlar</h3>
                <p><i>12345678902</i> <i>12345678900</i></p>
                <h3>Regex</h3>
                <pre>^[1-9]{1}[0-9]{9}[02468]{1}$</pre>
            </div>
            <div class="regex-item">
                <h2>Vergi Numarası</h2>
                <h3>Kabul edilen formatlar</h3>
                <p><i>1234567890</i></p>
                <h3>Regex</h3>
                <pre>/^[0-9]{10}$/</pre>
            </div>
            <div class="regex-item">
                <h2>Kredi Kartı Numarası</h2>
                <h3>Kabul edilen formatlar</h3>
                <p><i>1111222233334444<br>1111 2222 3333 4444</i></p>
                <h3>Regex</h3>
                <pre>/^([0-9]{4})\s?([0-9]{4})\s?([0-9]{4})\s?([0-9]{4})$/</pre>
            </div>
            <div class="regex-item">
                <h2>Araç Plakası</h2>
                <h3>Kabul edilen formatlar</h3>
                <p><i>34A2344<br>34A23415<br>06BK123<br>06JK1234<br>81ABC75</i></p>
                <h3>Regex</h3>
                <pre>/^(0[1-9]|[1-7][0-9]|8[01])(([A-Z])(\d{4,5})|([A-Z]{2})(\d{3,4})|([A-Z]{3})(\d{2,3}))$/</pre>
            </div>
            <div class="regex-item">
                <h2>Doğum Tarihi</h2>
                <h3>Kabul edilen formatlar</h3>
                <p><i>13.08.1987<br>13081987<br>13/08/1987<br>13-08-1987<br>13 08 1987</i></p>
                <h3>Regex</h3>
                <pre>/^([1-9]|[12][0-9]|3[01])(\/?\.?\-?\s?)(0[1-9]|1[12])(\/?\.?\-?\s?)(19[0-9][0-9]|20[0][0-9]|20[1][0-8])$/</pre>
            </div>
    </div>

