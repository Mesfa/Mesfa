package com.example.mesifx01.src;

import java.io.DataOutputStream;
import java.nio.charset.StandardCharsets;

public class checkSu {
    public static boolean checkRoot(){
        Process p = null;
        DataOutputStream outputStream = null;
        String su_path = "su";
        String test_string = "exit\n";
        try {
            p = Runtime.getRuntime().exec(su_path);
            outputStream = new DataOutputStream(p.getOutputStream());
            outputStream.write(test_string.getBytes(StandardCharsets.UTF_8),0,10);
            outputStream.flush();
            int exitValue = p.waitFor();
            return exitValue == 0;
        }
        catch (Exception e) {
           return false;
        }
        finally {
            try {
                if (outputStream!=null) {
                    outputStream.close();
                }
                p.destroy();
            }catch (Exception e){}
            return false;
        }
    }


    }

