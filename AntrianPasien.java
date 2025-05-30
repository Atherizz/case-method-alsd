public class AntrianPasien {
        Pasien[] data;
        int front, rear, size, max;

        AntrianPasien (int max) {
            this.max = max;
            this.data = new Pasien[max];
            front = 0;
            size = 0;
            rear = -1;
        }

        boolean isEmpty() {
            return size == 0;
        }

        boolean isFull() {
            return size == max;
        }

        void clear() {
            if (!isEmpty()) {
                front = -1;
                rear = -1;
                size = 0;
                System.out.println("Antrian berhasil dikosongkan");
            } else {
                System.out.println("Antrian masih kosong");
            }
        }

        void tambahAntrian (Pasien pasien) {
            if (isFull()) {
                System.out.println("Antrian penuh, tidak dapat menambah Pasien");
                return;
            } 
            rear = (rear + 1) % max;
            data[rear] = pasien;
            size++;
            System.out.println(pasien.nama + " berhasil masuk ke antrian");
        }

        Pasien layaniPasien() {
            if (isEmpty()) {
                System.out.println("antrian kosong");
                return null;
            } 

            Pasien pasien = data[front];
            front = (front+1) % max;
            size--;
            return pasien;
        }

        void lihatTerdepan() {
            if (isEmpty()) {
                System.out.println("antrian kosong");
            } else {
                System.out.println("Pasien terdepan : ");
                data[front].tampilkanInformasi();
            }
        }

            void lihatAkhir() {
            if (isEmpty()) {
                System.out.println("antrian kosong");
            } else {
                System.out.println("Pasien terakhir : ");
                data[rear].tampilkanInformasi();
            }
        }

        void tampilkanSemua() {
            if (isEmpty()) {
                System.out.println("Antrian Kosong");
                return;        
            } 
            System.out.println("Daftar Pasien dalam Antrian");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i+1) + ". ");
                data[index].tampilkanInformasi();
            }
        }

        int getJumlahAntrian() {
            return size;
        }
}
