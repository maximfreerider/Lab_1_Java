package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringProcessor implements Serializable, Runnable{

    public String readInputText() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String: ");
        return br.readLine();
    }

    public String processText(String inputText) {
        List<String> matches = new LinkedList<String>();
        Pattern pattern = Pattern.compile(	"RJ[0-9]{2}|([0-9][A-Z]){2}");

        Matcher matcher = pattern.matcher(inputText);

        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matches.add(matcher.group());
        }
        return matches.toString();
    }

   //@Override
    public void run() {

    }
}




 /* public List<String> processSentences(String[] sentences) {
            String[] outspokes = null;
            for(int i = 0; i < sentences.length - 1; i++) {
                outspokes = sentences[i].split("(?<=\\!)");
            }
            return processOutspokes(outspokes);
        }

        public List<String> processOutspokes(String[] outspokes) {
            List<String> result = new LinkedList<String>();
                for (String outspoke : outspokes) {
                    if (outspoke.endsWith("!") && outspoke.contains("-")) {
                        {
                            int count = outspoke.replaceAll("[^-]", "").length();
                            if (count >= 2) {
                                result.add(outspoke);
                            }
                        }
                    }
                }
            return result;
        }

       public void showResult(List<String> resultText) {
           System.out.println(resultText.toString());
       }*/

