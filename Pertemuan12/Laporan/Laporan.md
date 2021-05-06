## PERTEMUAN 12 DOUBLE LINKED LISTS

## Pertanyaan 12.2.3
1.	Single linked list 	: hanya memiliki satu pointer yaitu next
Double linked lists 	: memiliki dua pointer yaitu next dan prev
2.	Atribut next dan prev memiliki fungsi yang berbeda, dimana atribut next digunakan sebagai pointer untuk node selanjutnya dan atribut prev digunakan sebagai pointer untuk node sebelumnya
3.	Inisialisasi tersebut berfungsi untuk memberi tanda bahwa linked lists masih kosong, karena head bernilai null atau kosong dan size nya pun masih 0
4.	Parameter prev dianggap null karena pada method addFirst() digunakan untuk nilai yang akan ditambah pada awal list
5.	Statement tersebut berarti bahwa node sebelum head adalah node baru pada method addFisrt()
6.	Parameter prev sama dengan current berarti bahwa prev yang menjadi fokus kita saat ini dan sama seperti method addFirst(), maka pada method addLast() parameter next dibuat sama dengan null karena akan digunakan untuk data yang ditambahkan di node sesudah data terakhir

## Pertanyaan 12.3.3
1.	Pada method removeFirst(), kode tersebut berarti bahwa data paling awal (head) sama dengan node selanjutnya setelah head, dan node sebelum head masih kosong
2.	Untuk mengetahui data yang ada pada bagian akhir pada method removeLast() adalah dilihat pada kondisinya, jika memenuhi kondisi head.next == null maka dapat diartikan node selanjutnya setelah head bernilai kosong
3. karena data atau node yang diproses langsung merujuk pada head tanpa menggunakan node bantuan seperti tmp
4. kegunaan dari kode program di atas adalah untuk memindahkan rujukan
node.next pada node.next.next atau dengan kata lain melewati satu node yang dipilih
utuk dihapus.

## Pertanyaan 12.4.3
1.	Method tersebut digunakan untuk me-return jumlah(size) linked lists yang sudah di update
2. agar indeks dimulai pada indeks ke-1 hal yang harus dilakukan adalah mengganti posisi head dengan head.next
3.	jika pada single linked list saat menambah data hanya memperhatikan data.next sedangkan pada double linked list memperhatikan data.next dan juga data.prev
4.	Perbedaan logika dari keduanya adalah dimana untuk yang a dilakukan pengecekan kondisi terlebih dahulu, apakah size == 0 atau tidak. Jika iya, maka me-return true dan jika tidak memenuhi maka akan mereturn false. Untuk kode program yang b adalah jika menggunakan method tersebut maka akan langsung menjalankan statement nya yaitu me-return head sama dengan null atau kosong


## Tugas
1. Code
    * <img src="./screenshots/codeNo1.0.png">
    * <img src="./screenshots/codeNo1.1.png">
    * <img src="./screenshots/codeNo1.2.png">
    * <img src="./screenshots/codeNo1.3.png">
    * <img src="./screenshots/codeNo1.4.png">
    * <img src="./screenshots/codeNo1.5.png">
    * <img src="./screenshots/codeNo1.6.png">
    * <img src="./screenshots/codeNo1.7.png">
    * <img src="./screenshots/codeNo1.8.png">
    * <img src="./screenshots/codeNo1.9.png">
    * <img src="./screenshots/codeNo1.10.png">
    * <img src="./screenshots/codeNo1.11.png">
    * <img src="./screenshots/codeNo1.12.png">
    * <img src="./screenshots/codeNo1.13.png">
   Output
    * <img src="./screenshots/outputNo1.1.png">
    * <img src="./screenshots/outputNo1.2.png">
    * <img src="./screenshots/outputNo1.3.png">
    * <img src="./screenshots/outputNo1.4.png">
    * <img src="./screenshots/outputNo1.5.png">
    * <img src="./screenshots/outputNo1.6.png">
2. Code
    * <img src="./screenshots/codeNo2.1.png">
    * <img src="./screenshots/codeNo2.2.png">
    * <img src="./screenshots/codeNo2.3.png">
    * <img src="./screenshots/codeNo2.4.png">
    * <img src="./screenshots/codeNo2.5.png">
    * <img src="./screenshots/codeNo2.6.png">
    * <img src="./screenshots/codeNo2.7.png">
   Output
    * <img src="./screenshots/outputNo2.1.png">
    * <img src="./screenshots/outputNo2.2.png">
    * <img src="./screenshots/outputNo2.3.png">
3. Code
    * <img src="./screenshots/codeNo3.1.png">
    * <img src="./screenshots/codeNo3.2.png">
    * <img src="./screenshots/codeNo3.3.png">
    * <img src="./screenshots/codeNo3.4.png">
    * <img src="./screenshots/codeNo3.5.png">
    * <img src="./screenshots/codeNo3.6.png">
    * <img src="./screenshots/codeNo3.7.png">
   Output
    * <img src="./screenshots/outputNo3.1.png">
    * <img src="./screenshots/outputNo3.2.png">
    * <img src="./screenshots/outputNo3.3.png">
    * <img src="./screenshots/outputNo3.4.png">
4. Code
    * <img src="./screenshots/codeNo4.1.png">
    * <img src="./screenshots/codeNo4.2.png">
    * <img src="./screenshots/codeNo4.3.png">
    * <img src="./screenshots/codeNo4.4.png">
    * <img src="./screenshots/codeNo4.5.png">
    * <img src="./screenshots/codeNo4.6.png">
    * <img src="./screenshots/codeNo4.7.png">
    * <img src="./screenshots/codeNo4.8.png">
    * <img src="./screenshots/codeNo4.9.png">
    * <img src="./screenshots/codeNo4.10.png">
    * <img src="./screenshots/codeNo4.11.png">
   Output
    * <img src="./screenshots/outputNo4.1.png">
    * <img src="./screenshots/outputNo4.2.png">
    * <img src="./screenshots/outputNo4.3.png">
    * <img src="./screenshots/outputNo4.4.png">
    * <img src="./screenshots/outputNo4.5.png">
    * <img src="./screenshots/outputNo4.6.png">
    * <img src="./screenshots/outputNo4.7.png">
    * <img src="./screenshots/outputNo4.8.png">