package com.quantela.codenet.qa.qpf_wallet_mob_ui_test.utils;

public class Sleep {

    public static void waitFor(int millisecond){
        try {
            Thread.sleep(millisecond);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
