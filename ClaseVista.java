import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JTextField;

public class ClaseVista extends JFrame {

	private static final long serialVersionUID = 1L;
	int a=(int) ((3-0+1)*Math.random()+0);

	Container bloqueContenedor = null; 
	JButton a1 = null;
	JButton a2 = null;
	JButton a3 = null;
	JButton a4 = null;
	JButton a5 = null;
	JButton a6 = null;
	JButton a7 = null;
	JButton a8 = null;
	JButton a9 = null;
	JButton a10 = null;
	JButton a11 = null;
	JButton a12 = null;
	JButton a13 = null;
	JButton a14 = null;
	JButton a15 = null;
	JButton a16 = null;
	JButton a17 = null;
	JButton a18 = null;
	JButton a19 = null;
	JButton a20 = null;
	JButton a21 = null;
	JButton a22 = null;
	JButton a23 = null;
	JButton a24 = null;
	JButton a25 = null;

	private Object be;

	public ClaseVista() {
		bloqueContenedor = getContentPane(); 
		setTitle("Calculadora MVC"); 
		setLayout(new FlowLayout()); 
		setSize(300,320);

		a1 = new JButton("");
		a2 = new JButton("");
		a3 = new JButton("");
		a4 = new JButton("");
		a5 = new JButton("");
		a6 = new JButton("");
		a7 = new JButton("");
		a8 = new JButton("");
		a9 = new JButton("");
		a10 = new JButton("");
		a11 = new JButton("");
		a12 = new JButton("");
		a13 = new JButton("");
		a14 = new JButton("");
		a15 = new JButton("");
		a16 = new JButton("");
		a17 = new JButton("");
		a18 = new JButton("");
		a19 = new JButton("");
		a20 = new JButton("");
		a21 = new JButton("");
		a22 = new JButton("");
		a23 = new JButton("");
		a24 = new JButton("");
		a25 = new JButton("");


		bloqueContenedor.add(a1);
		bloqueContenedor.add(a2);
		bloqueContenedor.add(a3);
		bloqueContenedor.add(a4);
		bloqueContenedor.add(a5);
		bloqueContenedor.add(a6);
		bloqueContenedor.add(a7);
		bloqueContenedor.add(a8);
		bloqueContenedor.add(a9);
		bloqueContenedor.add(a10);
		bloqueContenedor.add(a11);
		bloqueContenedor.add(a12);
		bloqueContenedor.add(a13);
		bloqueContenedor.add(a14);
		bloqueContenedor.add(a15);
		bloqueContenedor.add(a16);
		bloqueContenedor.add(a17);
		bloqueContenedor.add(a18);
		bloqueContenedor.add(a19);
		bloqueContenedor.add(a20);
		bloqueContenedor.add(a21);
		bloqueContenedor.add(a22);
		bloqueContenedor.add(a23);
		bloqueContenedor.add(a24);
		bloqueContenedor.add(a25);

		//set button size
		Dimension d = new Dimension(50,50);
		a1.setPreferredSize(d);
		a2.setPreferredSize(d);
		a3.setPreferredSize(d);
		a4.setPreferredSize(d);
		a5.setPreferredSize(d);
		a6.setPreferredSize(d);
		a7.setPreferredSize(d);
		a8.setPreferredSize(d);
		a9.setPreferredSize(d);
		a10.setPreferredSize(d);
		a11.setPreferredSize(d);
		a12.setPreferredSize(d);
		a13.setPreferredSize(d);
		a14.setPreferredSize(d);
		a15.setPreferredSize(d);
		a16.setPreferredSize(d);
		a17.setPreferredSize(d);
		a18.setPreferredSize(d);
		a19.setPreferredSize(d);
		a20.setPreferredSize(d);
		a21.setPreferredSize(d);
		a22.setPreferredSize(d);
		a23.setPreferredSize(d);
		a24.setPreferredSize(d);
		a25.setPreferredSize(d);


		a1.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a1.setText(""+a);
			}
		}
				);
		a2.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a2.setText(""+a);
			}
		}
				);
		a3.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a3.setText(""+a);
			}
		}
				);
		a4.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a4.setText(""+a);
			}
		}
				);
		a5.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a5.setText(""+a);
			}
		}
				);
		a6.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a6.setText(""+a);
			}
		}
				);
		a7.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a7.setText(""+a);
			}
		}
				);
		a8.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a8.setText(""+a);
			}
		}
				);
		a9.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a9.setText(""+a);
			}
		}
				);
		a10.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a10.setText(""+a);
			}
		}
				);
		a11.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a11.setText(""+a);
			}
		}
				);
		a12.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a12.setText(""+a);
			}
		}
				);
		a13.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a13.setText(""+a);
				
			}
		}
				);
		a14.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a14.setText(""+a);
			}
		}
				);
		a15.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a15.setText(""+a);
			}
		}
				);
		a16.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a16.setText(""+a);
			}
		}
				);
		a17.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a17.setText(""+a);
			}
		}
				);
		a18.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a18.setText(""+a);
			}
		}
				);
		a19.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a19.setText(""+a);
			}
		}
				);
		a20.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a20.setText(""+a);
			}
		}
				);
		a21.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a21.setText(""+a);
			}
		}
				);
		a22.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a22.setText(""+a);
			}
		}
				);
		a23.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a23.setText(""+a);
			}
		}
				);
		a24.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a24.setText(""+a);
			}
		}
				);
		a25.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				int a=(int) ((3-0+1)*Math.random()+0);
				a25.setText(""+a);
			}
		}
				);
		
		/*cambia color del boton al clickar
		a1.addMouseListener(new java.awt.event.MouseAdapter() { 
			public void mouseClicked(java.awt.event.MouseEvent e) { 
				a1.setBackground(java.awt.Color.yellow);
			} 
		}
				);*/

		setVisible(true);
	}
}
