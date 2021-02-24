package sample;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class dictionary {

    //public static void main(String[] args) throws IOException {
    public static String dic(String s) throws IOException {
        // write your code here
        // String find[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String find=s;
        BufferedReader bru = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_u.txt"));
        BufferedReader brv = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_v.txt"));
        BufferedReader brw = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_w.txt"));
        BufferedReader brx = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_x.txt"));
        BufferedReader bry = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_y.txt"));
        BufferedReader brt = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_t.txt"));
        BufferedReader brs = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_s.txt"));
        BufferedReader brr = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_r.txt"));
        BufferedReader brq = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_q.txt"));
        BufferedReader brj = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_j.txt"));
        BufferedReader brk = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_k.txt"));
        BufferedReader brl = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_L.txt"));
        BufferedReader brm = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_m.txt"));
        BufferedReader brn = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_n.txt"));
        BufferedReader bro = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_o.txt"));
        BufferedReader brp = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_p.txt"));
        BufferedReader brz = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_z.txt"));
        BufferedReader bra = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_a.txt"));
        BufferedReader brb = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_b.txt"));
        BufferedReader brc = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_c.txt"));
        BufferedReader brd = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_d.txt"));
        BufferedReader bre = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_e.txt"));
        BufferedReader brf = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_f.txt"));
        BufferedReader brg = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_g.txt"));
        BufferedReader brh = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_h.txt"));
        BufferedReader bri = new BufferedReader(new FileReader("G:\\IdeaProjects\\dictionary\\src\\Oxford English Dictionary_i.txt"));
        String lin = null;
        HashMap<String, String> map = new HashMap<String, String>();
        int i = 0;

        if (find.charAt(0) == 'U') {
            while ((lin = bru.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }

        }
        if (find.charAt(0) == 'V') {
            while ((lin = brv.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }
            //String s="Uva";

        }
        if (find.charAt(0) == 'W') {
            while ((lin = brw.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }
            //String s="Uva";

        }
        if (find.charAt(0) == 'X') {
            while ((lin = brx.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }

        }
        if (find.charAt(0) == 'Y') {
            while ((lin = bry.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }

        }
        if (find.charAt(0) == 'Z') {
            while ((lin = brz.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }

        }
        if (find.charAt(0) == 'T') {
            while ((lin = brt.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }

        }
        if (find.charAt(0) == 'S') {
            while ((lin = brs.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }

        }
        if (find.charAt(0) == 'R') {
            while ((lin = brr.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }

        }
        if (find.charAt(0) == 'Q') {
            while ((lin = brq.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }

        }
        if (find.charAt(0) == 'P') {
            while ((lin = brp.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }

        }
        if (find.charAt(0) == 'J') {
            while ((lin = brj.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }

        }
        if (find.charAt(0) == 'K') {
            while ((lin = brk.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }

        }
        if (find.charAt(0) == 'L') {
            while ((lin = brl.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }

        }
        if (find.charAt(0) == 'M') {
            while ((lin = brm.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }

        }
        if (find.charAt(0) == 'N') {
            while ((lin = brn.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }

        }
        if (find.charAt(0) == 'O') {
            while ((lin = bro.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }

        }
        if (find.charAt(0) == 'A') {
            while ((lin = bra.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }

        }
        if (find.charAt(0) == 'B') {
            while ((lin = brb.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }

        }
        if (find.charAt(0) == 'C') {
            while ((lin = brc.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }

        }
        if (find.charAt(0) == 'D') {
            while ((lin = brd.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }

        }
        if (find.charAt(0) == 'E') {
            while ((lin = bre.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }

        }
        if (find.charAt(0) == 'F') {
            while ((lin = brf.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }

        }
        if (find.charAt(0) == 'G') {
            while ((lin = brg.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }

        }
        if (find.charAt(0) == 'H') {
            while ((lin = brh.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }

        }
        if (find.charAt(0) == 'I') {
            while ((lin = bri.readLine()) != null) {
                if (i % 2 == 0) {
                    String[] keys = lin.split(" ", 2);
                    if (keys.length == 2)
                        map.put(keys[0], keys[1]);
                    // System.out.println(keys.length);
                    i++;
                } else
                    i++;
                //System.out.println(i);
            }

        }
        //System.out.println(map.get(find));
        if(!map.containsKey(find))
        { JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f,"Not found");}
        else{
        String res=map.get(find);

        return res;}
        return null;
    }
}
