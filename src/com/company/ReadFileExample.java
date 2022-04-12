package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            // Đọc file theo đường dẫn
            File file = new File(filePath);

// Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            // Đọc từng dòng của file và tiến hành cộng tổng lại
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = " ";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Sum =" + sum);

        } catch (Exception e) {
            System.out.println("File khong ton tai hoac co loi");

        }
    }
}
