import java.util.*

public var input = Scanner(System.`in`);

fun main() {
    println("============Identitas===============");
    print("Nama : ");
    var n: String? = input.nextLine();

    //input validation nama wajib di isi
    if (n.isNullOrEmpty()){
        println("Nama wajib di isi")
        main()
    }

    print("Kelas : ");
    var k: String = input.nextLine();
    print("Absen : ")
    var na: String = input.nextLine();
    menu()

}

// menu pemlihan opsi
fun menu(){
    println("================MENGHITUNG BANGUN RUANG================");
    println("1. Volume Kerucut\n2. Volume Tabung\n3. Exit")
    print ("Pilih Menu Diatas : ")
    val pill:Int? = input.nextInt()
    when (pill) {
        1 -> kerucut()
        2 -> tabung()
        3 -> exit()
        else -> {
            println("Menu tidak tersedia")
            menu()
        }
    }
}


fun kerucut(){
    println("============Menghitung Volume Kerucut===============");
    print("Masukan Tinggi Kerucut : ");
    val tinggi:Double = input.nextDouble();
    print("Masukan Jari-jari Kerucut : ");
    val jk:Double = input.nextDouble();

    //perhitungan
    val volume:Double = (0.33333) * Math.PI * (jk*jk) * tinggi;
    println ("Volume Kerucut Adalah $volume")
    println()
    //back to menu
    menu()
    println("=================================");
}

fun tabung(){
    println("============Menghitung Volume Tabung===============");
    print("Masukan Tinggi tabung : ");
    var tinggi:Double? = null
    tinggi = input.nextDouble();
    print("Masukan jari-jari tabung: ");
    var jt:Double? = null
    jt = input.nextDouble();

    val volume = Math.PI * jt * jt * tinggi
    println("Volume Tabung adalah : $volume")
    println()
    //back to menu
    menu()
}
fun exit(){
    System.exit(0)
}