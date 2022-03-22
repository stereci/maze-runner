# maze-runner
Labirentten Çıkış
Özet

Bu yarışmada hedefiniz size verilen bir labirentte ilerleyerek başlangıç noktasından bitiş noktasına ulaşmak olacak. Labirent içinde sizin için gizlediğimiz bir mesaj bulunuyor. Yol üzerinde bulacağınız ipuçlarını bir araya getirerek oluşturacağınız bu gizli mesaj size ne yapmanız gerektiğini söyleyecek.

Labirent Yapısı

Labirenti sizinle aşağıda bir txt dosyası olarak paylaşıyoruz.

    Bu txt dosyasının ilk satırında aralarında boşluklar bırakılmış bir şekilde labirentin eni ve yüksekliği bulunuyor.
    Bu satırdan sonra en*yükseklik sayısı kadar satır bulunuyor. Bu satırların her biri labirentin bir hücresini temsil ediyor.
        Labirent hücreleri soldan sağa doğru taranmış bir şekilde txt dosyasında tutuluyor. Örneğin 5*5 lik bir labirentte 3. satırda bulunan ilk hücre 12. satırda ifade ediliyor (labirentin büyüklüğünü belirten ilk satır ve ilk iki satırdaki hücrelerin ifade edildiği 10 satırdan sonra).
        Kolaylık sağlaması açısından labirentin girişi her zaman en üstte, çıkışı en altta yer alıyor. Başlangıç ve bitiş için bu durumu göz önünde bulundurmalısınız.
    Her satır 4 adet 0 veya 1, ardından varsa o hücrede bulunan ipcunu içeriyor. İpucu içermeyen satırlarda boşluk(' ') karakteri bulunuyor.
        İlk 4 karakter hücrenin çevresindeki (sırasıyla [üst][sağ][alt][sol]) duvarları tanımlamak için kullanılıyor. 0 duvar olmadığını 1 ise duvar olduğunu ifade ediyor. Yani '1011' şeklinde bir karakter dizisi hücrenin üstünde altında ve solunda duvar olduğunu sağının ise açık olduğunu ifade ediyor.
        Her satırdaki son karakter hücre içindeki potansiyel ipucunu içeriyor. Bu ipuçlarını toplayarak sizinle paylaştığımız gizli mesajı ortaya çıkarmanızı bekliyoruz.
    
    
    Aşağıdaki örnekte görseli verilmiş 5*5 lik bir labirent ve onun txt dosyasındaki gösterimi bulunuyor;
    
    ![sample](https://user-images.githubusercontent.com/22882422/159501396-8a728abb-21db-49cb-95f8-05820407affa.png)

5 5
1001c
1010 
0010i
1010p
1100 
0101 
1001 
1110r
1001 
0100u
0011e
0110 
1001 
0110c
0101 
1001 
1000 
0110 
1001d
0110 
0111 
0011 
1100u
0011y
1110 

Bu labirenti çözdüğümüz zaman elimize "ipucu" mesajının geçmesi gerekiyor.


Labirent txt dosyası:
[mazenewhinted.txt](https://github.com/stereci/maze-runner/files/8324999/mazenewhinted.txt)

