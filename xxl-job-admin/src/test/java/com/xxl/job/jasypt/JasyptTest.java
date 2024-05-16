package com.xxl.job.jasypt;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptTest {

    /**
     * Jasypt生成加密结果
     */
    public static void main(String[] args) {

        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword("123456");
        String encrypt = textEncryptor.encrypt("123456");
        System.out.println(encrypt);
    }

}
