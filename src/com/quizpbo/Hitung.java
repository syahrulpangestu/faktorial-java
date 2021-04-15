package com.quizpbo;

public class Hitung {
    public int faktorial(int angka){
        if (angka == 1 || angka == 0){
            return 1;
        }else {
            return (angka*faktorial(angka-1));
        }
    }
}
