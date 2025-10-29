# DasproJobsheet8
Materi Perulangan (Looping) 2

Pertanyaan Percobaan 1
1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya?
Mengapa bisa demikian?
= Output akan ditambah 1 pada inputan N yang dimasukkan oleh user, jadi semisal N di input 5 bintang, nanti output nya akan 6 bintang, itu terjadi karena pada perulangan for i dimulai dari angka 0, jadi program akan membaca i dimulai dari 0, misal di input N = 5 maka program akan memulai dari i=0 apakah memenuhi i <= N jika TRUE makan akan terus berlanjut ke i=1, i=2, i=3, i=4, i=5 sudah cukup, karena jika i=6 apakah memenuhi i<=N itu FALSE jadi program akan berhenti mengechek i dan mencetak bintang sejumlah 6 bintang.

2. Jika pada perulangan for, kondisi i <= N diubah menjadi i > N, apa akibatnya? Mengapa
bisa demikian?
= Tidak ada ouputan, karena pemrograman mengechek i dimulai dari 1, nah jika i=1 apakah memenuhi i>N tentu saja FALSE makannya program akan langsung menghentikan pemrograman (end). Jika i sudah tidak memenuhi syarat maka program akan berhenti.

3. Jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya? Mengapa
bisa demikian?
= i tidak akan di tambah kan 1, jadi setelah meng-input N, N akan diperiksa dengan aturan i dimulai dari 1, i=1 apakah memenuhi i<=N TRUE, namun setelah True seharusnya akan berlanjut pada i++ dimana i akan di jalankan lalu ++ ditambahkan untuk mengeluarkan STAR. Namun jika i diubah menjadi i-- pemrograman tetap mengoperasikan i namun tidak menambahkan STAR tetapi mengurangi, pada akhirnya tidak mengeluarkan STAR sama sekali lalu program akan tetap mengechek i sampai FALSE lalu mengakhiri (end).