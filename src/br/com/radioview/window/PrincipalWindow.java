package br.com.radioview.window;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractListModel;
import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JTree;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.WindowConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

public class PrincipalWindow extends JFrame implements RadioWindow{
	
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;                  
    private JToggleButton RepeatMusic;
    private JToggleButton alleatoryReproduction;
    private Box.Filler center;
    private JLabel informations;
    private JMenu jMenu1;
    private JMenuItem jMenuItem1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane5;
    private JTree libThree;
    private JList listFriends;
    private JList musicsList;
    private JPanel north;
    private JButton playMusicButton;
    private JSlider progressItem;
    private JTextField searchMusics;
    private JTabbedPane tabelOptions;
    // End of variables declaration 
    
	 /**
     * Creates new form RadioUfcg
     */
    public PrincipalWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
                           
    private void initComponents() {

        jMenuItem1 = new JMenuItem();
        jMenu1 = new JMenu();
        jScrollPane1 = new JScrollPane();
        musicsList = new JList();
        RepeatMusic = new JToggleButton();
        progressItem = new JSlider();
        searchMusics = new JTextField();
        center = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 32767));
        north = new JPanel();
        informations = new JLabel();
        tabelOptions = new JTabbedPane();
        jScrollPane5 = new JScrollPane();
        libThree = getThrees();
        jScrollPane2 = new JScrollPane();
        listFriends = new JList();
        alleatoryReproduction = new JToggleButton();
        playMusicButton = new JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        musicsList.setModel(new AbstractListModel() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			String[] strings = { "music 1", "music 2", "music 3", "music 4", "music 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(musicsList);

        RepeatMusic.setText("repeat");
        RepeatMusic.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RepeatMusicActionPerformed(evt);
            }
        });

        north.setBackground(new Color(64, 102, 232));

        informations.setText("Nome do usuário");

        GroupLayout northLayout = new GroupLayout(north);
        north.setLayout(northLayout);
        northLayout.setHorizontalGroup(
            northLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(northLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(informations)
                .addContainerGap(536, Short.MAX_VALUE))
        );
        northLayout.setVerticalGroup(
            northLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(northLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(informations))
        );
        
        jScrollPane5.setViewportView(libThree);

        tabelOptions.addTab("Biblioteca", jScrollPane5);

        listFriends.setModel(new AbstractListModel() {
            /**
			 * 
			 */
			private static final long serialVersionUID = -7352136364622962965L;
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listFriends);

        tabelOptions.addTab("Amigos", jScrollPane2);

        alleatoryReproduction.setText("jToggleButton1");

        playMusicButton.setText("jButton1");
        playMusicButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playMusicButtonActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabelOptions, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(center, GroupLayout.PREFERRED_SIZE, 373, GroupLayout.PREFERRED_SIZE)
                    .addComponent(progressItem, GroupLayout.PREFERRED_SIZE, 373, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RepeatMusic, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(alleatoryReproduction, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playMusicButton)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(searchMusics, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(north, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(north, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(center, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(progressItem, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(RepeatMusic)
                            .addComponent(alleatoryReproduction)
                            .addComponent(playMusicButton))
                        .addGap(52, 52, 52))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchMusics, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tabelOptions, GroupLayout.PREFERRED_SIZE, 513, GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35))))
        );

        pack();
    }                      

    private JTree getThrees() {
    	DefaultMutableTreeNode node = new DefaultMutableTreeNode();
		return null;
	}

	private void RepeatMusicActionPerformed(ActionEvent evt) {                                            
        
    }                                           

    private void playMusicButtonActionPerformed(ActionEvent evt) {                                                
        // TODO add your handling code here:
    }

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}                                            
                  
}