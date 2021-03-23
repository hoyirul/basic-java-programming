# Pertemuan 5

## Pertanyaan 4.2.3
1. Base line pada faktorial dengan metode divide conquer tersebut adalah apabila nilai n = 1 maka akan mereturn nilai 1 selain itu maka akan mereturn n x faktorial(n-1) //memanggil dirinya sendiri.
2. Benar, Terdiri 3 Tahapan :
    * Proses Devide:
        - int fakto = n * faktorialDC(n-1);
    * Proses conquer:
        - if(n == 1) {return 1;}  
    * Proses combine:
        - return fakto;
3. Ya memungkinkan
    - <img src="./screenshot/">