package com.sse.file.encryption.entity;

public class AES_Encrypt {
    String hex_encrypt;
    String content_decrypt;

    public AES_Encrypt (String hex_encrypt, String content_decrypt){
        this.hex_encrypt = hex_encrypt;
        this.content_decrypt = content_decrypt;
    }
    public String getHex_encrypt() {
        return hex_encrypt;
    }

    public String getContent_decrypt() {
        return content_decrypt;
    }
}
