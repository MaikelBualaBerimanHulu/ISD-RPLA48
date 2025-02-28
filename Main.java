import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GenericData<Tradisional> tradisionalData = new GenericData<>();
        GenericData<Elektronik> elektronikData = new GenericData<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Tambah Data Alat Musik");
            System.out.println("2. Edit Data Alat Musik");
            System.out.println("3. Hapus Data Alat Musik");
            System.out.println("4. Tampilkan Data Alat Musik");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan kode alat musik (T/E): ");
                    String kode = scanner.nextLine();
                    System.out.print("Masukkan nama alat musik: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan harga per unit: ");
                    double harga = scanner.nextDouble();
                    System.out.print("Masukkan stok tersedia: ");
                    int stok = scanner.nextInt();
                    scanner.nextLine(); 

                    if (kode.startsWith("T")) {
                        tradisionalData.addData(new Tradisional(kode, nama, harga, stok));
                    } else if (kode.startsWith("E")) {
                        elektronikData.addData(new Elektronik(kode, nama, harga, stok));
                    } else {
                        System.out.println("Kode tidak valid!");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan kode alat musik yang akan diedit: ");
                    String editKode = scanner.nextLine();
                    System.out.print("Masukkan nama baru: ");
                    String newNama = scanner.nextLine();
                    System.out.print("Masukkan harga baru: ");
                    double newHarga = scanner.nextDouble();
                    System.out.print("Masukkan stok baru: ");
                    int newStok = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (editKode.startsWith("T")) {
                        for (int i = 0; i < tradisionalData.getDataList().size(); i++) {
                            if (tradisionalData.getDataList().get(i).getKodeAlatMusik().equals(editKode)) {
                                tradisionalData.editData(i, new Tradisional(editKode, newNama, newHarga, newStok));
                                break;
                            }
                        }
                    } else if (editKode.startsWith("E")) {
                        for (int i = 0; i < elektronikData.getDataList().size(); i++) {
                            if (elektronikData.getDataList().get(i).getKodeAlatMusik().equals(editKode)) {
                                elektronikData.editData(i, new Elektronik(editKode, newNama, newHarga, newStok));
                                break;
                            }
                        }
                    } else {
                        System.out.println("Kode tidak valid!");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan kode alat musik yang akan dihapus: ");
                    String deleteKode = scanner.nextLine();

                    if (deleteKode.startsWith("T")) {
                        for (Tradisional data : tradisionalData.getDataList()) {
                            if (data.getKodeAlatMusik().equals(deleteKode)) {
                                tradisionalData.removeData(data);
                                break;
                            }
                        }
                    } else if (deleteKode.startsWith("E")) {
                        for (Elektronik data : elektronikData.getDataList()) {
                            if (data.getKodeAlatMusik().equals(deleteKode)) {
                                elektronikData.removeData(data);
                                break;
                            }
                        }
                    } else {
                        System.out.println("Kode tidak valid!");
                    }
                    break;

                case 4:
                    System.out.println("Alat Musik Tradisional:");
                    tradisionalData.displayData();
                    System.out.println("Alat Musik Elektronik:");
                    elektronikData.displayData();
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}