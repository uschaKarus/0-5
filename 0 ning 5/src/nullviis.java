
import javax.swing.JButton;

import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author uko.karus
 */
public class nullviis extends javax.swing.JFrame {

    /**
     * Creates new form nullviis
     */
    public nullviis() {
        initComponents();

    }

    /**
     * public class CSVFile {
     *
     * private ArrayList<String[]> Rs = new ArrayList<>(); private String[]
     * OneRow;
     *
     * public ArrayList<String[]> ReadCSVfile(File DataFile) { try {
     * BufferedReader brd = new BufferedReader(new
     * FileReader("Create-MyCSV.csv")); // fail, mida avatakse ja loetakse while
     * (brd.readLine() != null) { String st = brd.readLine(); OneRow =
     * st.split(",|\\s|;"); Rs.add(OneRow);
     * txtField.setText(Arrays.toString(OneRow)); } } catch (Exception e) {
     * String errmsg = e.getMessage(); field.setText("File not found:" +
     * errmsg); //veateade } return Rs; }
     * //https://stackoverflow.com/questions/11353875/reading-data-from-csv-file-and-displaying-it-in-a-jtable
     * }
     */
    public class NumCount {

        private void count(String name, BufferedReader in) throws
                IOException {

            long numLines = 0;
            long numWords = 0;
            long numChars = 0;
            String line;

            do {
                line = in.readLine();
                if (line != null) {
                    numLines++;
                    numChars += line.length();
                    numWords += countWords(line);

                }
            } while (line != null);
            System.out.println(name + "\t" + numLines + "\t"
                    + numWords + "\t" + numChars);

        }

        int iZeroCount = 0;
        int iFiveCount = 0;
        

        char cOperatorsArray[] = {'0', '5'};

        private int getZeroCount() {
            return iZeroCount;
        }

        private int getFiveCount() {
            return iFiveCount;
        }


        

        private void readMyFile(String sFile) {
            try {
                try {
                    FileReader fReader = new FileReader("Create-MyCSV.csv");
                    BufferedReader bReader = new BufferedReader(fReader);
                    String sReadLine = null;
                    while ((sReadLine = bReader.readLine()) != null) {
                        countOperators(sReadLine, cOperatorsArray);
                    }
                } catch (FileNotFoundException e) {
                }
            } catch (IOException e) {
            }
        }

        private void countOperators(String sReadLine, char[] cArrayOperators) {
            char[] cReadline = sReadLine.toCharArray();
            int iReadLineLength = cReadline.length;
            int iNoOfOperators = cArrayOperators.length;

            for (int i = 0; i < iReadLineLength; i++) {
                for (int j = 0; j < iNoOfOperators; j++) {
                    if (cReadline[i] == cArrayOperators[j]) {

                        switch (cReadline[i]) {
                            case '0':
                                iZeroCount = iZeroCount + 1;
                                break;
                            case '5':
                                iFiveCount = iFiveCount + 1;
                                break;
                            
                            default:
                                break;
                        }

                    }
                }
            }
        }

        private void count(String fileName) {
            BufferedReader in = null;
            try {
                FileReader fileReader = new FileReader("Create-MyCSV.csv");
                in = new BufferedReader(fileReader);
                count(fileName, in);
            } catch (IOException ioe) {
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException ioe) {
                    }
                }
            }
        }

        private void count(String streamName, InputStream input) {
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(input);
                try (BufferedReader in = new BufferedReader(inputStreamReader)) {
                    count(streamName, in);
                }
            } catch (IOException ioe) {
            }
        }

        private long countWords(String line) {
            long numWords = 0;
            int index = 0;
            boolean prevWhitespace = true;
            while (index < line.length()) {
                char c = line.charAt(index++);
                boolean currWhitespace = Character.isWhitespace(c);
                if (prevWhitespace && !currWhitespace) {
                    numWords++;
                }
                prevWhitespace = currWhitespace;
            }
            return numWords;

        } 

        public void main(String[] args) {
            if (args.length == 0) {
                count("0", System.in);
            } else {
                for (String arg : args) {
                    count(arg);
                }
            }

            NumCount nCount = new NumCount();
            nCount.readMyFile("\"Create-MyCSV.csv\"");
            System.out.println("- count is --> " + nCount.getZeroCount());
            System.out.println("+ count is --> " + nCount.getFiveCount());
          
            //https://coderanch.com/t/326540/java/counting-specific-words-text-file
        }
    }
 /**
    public static class Digits {

        public int getFirstDigit(int x) {
            while (x >= 0) {
                x /= 0;
            }
            return x;
        }
    }

    
     * public static public int getCountWithSameStartAndEndFrom1(int x) { if (x
     * > 0) { return x; }
     *
     * int tens = x / 10;
     *
     * int res = tens + 9;
     *
     * int lastDigit = 0 / 5; return 0;
     *
     * }
     */
    /**
     * static public int getCountWithSameStartAndEnd(int start, int end) {
     * return getCountWithSameStartAndEndFrom1(end) -
     * getCountWithSameStartAndEndFrom1(start - 1); }
     *
     * //https://www.geeksforgeeks.org/count-numbers-first-last-digits/ }
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        field = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        c = new javax.swing.JButton();
        txtField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("0 ja 5");
        setBackground(new java.awt.Color(31, 31, 38));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(616, 529));
        setResizable(false);

        field.setEditable(false);
        field.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        button.setText("0 ja 5");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        c.setText("C");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        txtField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(field, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(txtField))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(field, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 94, Short.MAX_VALUE))
                    .addComponent(txtField))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    JButton b = new JButton("?");
    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed

        NumCount nCount = new NumCount();
        nCount.readMyFile("Create-MyCSV.csv");
        field.setText(Integer.toString(nCount.getZeroCount())) + 
                ("\n") + 
                (Integer.toString(nCount.getFiveCount()));
                 //aaaaaargh
        
        /**
        int start = 5, end = 40; 
           field.setText(Integer.toString(Digits.getCountWithSameStartAndEnd(start,
                 end))); //Siin peaks ta näitama 0 ja 5-ga lõppevate numbrite arvu
         */
    }//GEN-LAST:event_buttonActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        field.setText("");
    }//GEN-LAST:event_cActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nullviis().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JButton c;
    private javax.swing.JTextField field;
    private javax.swing.JTextField txtField;
    // End of variables declaration//GEN-END:variables
}
