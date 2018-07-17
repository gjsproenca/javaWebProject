/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PrinterException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.io.IOException;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterJob;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Element;

import org.apache.commons.io.FileUtils;

/**
 *
 * @author osao
 */
public class Window extends javax.swing.JFrame {

    /**
     * Creates new form Window
     */
    public Window() {
        makeDirectories();
        loadData();
        initComponents();

        jSlider.addChangeListener(e -> sliderChanged());
        if (arrayList.size() == 0) {
            jSlider.setMaximum(arrayList.size());
        } else {
            jSlider.setMaximum(arrayList.size() - 1);
        }

        System.out.println("Initial array list size = " + arrayList.size());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContainer = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonNew = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButtonDelete = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButtonExport = new javax.swing.JButton();
        jButtonPrint = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButtonSearch = new javax.swing.JButton();
        jPanelMain = new javax.swing.JPanel();
        jPanelSlider = new javax.swing.JPanel();
        jSlider = new javax.swing.JSlider();
        jSplitPane1 = new javax.swing.JSplitPane();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanelNotes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaNotes = new javax.swing.JTextArea();
        jPanelImage = new javax.swing.JPanel();
        jLabelImage = new javax.swing.JLabel();
        jPanelDetails = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaAddress = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(530, 530));
        setResizable(false);

        jToolBar1.setRollover(true);

        jButtonNew.setText("New");
        jButtonNew.setFocusable(false);
        jButtonNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonNew);

        jButtonEdit.setText("Edit");
        jButtonEdit.setFocusable(false);
        jButtonEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEdit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonEdit);

        jButtonSave.setText("Save");
        jButtonSave.setFocusable(false);
        jButtonSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonSave);
        jToolBar1.add(jSeparator3);

        jButtonDelete.setText("Delete");
        jButtonDelete.setFocusable(false);
        jButtonDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonDelete);
        jToolBar1.add(jSeparator1);

        jButtonExport.setText("Export");
        jButtonExport.setFocusable(false);
        jButtonExport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonExport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonExport);

        jButtonPrint.setText("Print");
        jButtonPrint.setFocusable(false);
        jButtonPrint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPrint.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonPrint);
        jToolBar1.add(jSeparator2);

        jButtonSearch.setText("Search");
        jButtonSearch.setFocusable(false);
        jButtonSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSearch.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonSearch);

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
        );

        jSlider.setMajorTickSpacing(1);
        jSlider.setMaximum(30);
        jSlider.setPaintLabels(true);
        jSlider.setSnapToTicks(true);
        jSlider.setValue(0);

        javax.swing.GroupLayout jPanelSliderLayout = new javax.swing.GroupLayout(jPanelSlider);
        jPanelSlider.setLayout(jPanelSliderLayout);
        jPanelSliderLayout.setHorizontalGroup(
            jPanelSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelSliderLayout.setVerticalGroup(
            jPanelSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSliderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jSplitPane1.setDividerLocation(385);
        jSplitPane1.setEnabled(false);

        jSplitPane2.setDividerLocation(150);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane2.setEnabled(false);

        jPanelNotes.setBorder(javax.swing.BorderFactory.createTitledBorder("Notes"));

        jTextAreaNotes.setEditable(false);
        jTextAreaNotes.setColumns(20);
        jTextAreaNotes.setRows(5);
        jScrollPane1.setViewportView(jTextAreaNotes);

        javax.swing.GroupLayout jPanelNotesLayout = new javax.swing.GroupLayout(jPanelNotes);
        jPanelNotes.setLayout(jPanelNotesLayout);
        jPanelNotesLayout.setHorizontalGroup(
            jPanelNotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNotesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelNotesLayout.setVerticalGroup(
            jPanelNotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNotesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane2.setBottomComponent(jPanelNotes);

        jPanelImage.setBorder(javax.swing.BorderFactory.createTitledBorder("Photo"));
        jPanelImage.setMaximumSize(new java.awt.Dimension(3333, 3030));
        jPanelImage.setPreferredSize(new java.awt.Dimension(200, 200));

        jLabelImage.setToolTipText("");
        jLabelImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelImage.setMaximumSize(new java.awt.Dimension(345, 120));
        jLabelImage.setMinimumSize(new java.awt.Dimension(345, 200));
        jLabelImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadImage(evt);
            }
        });

        javax.swing.GroupLayout jPanelImageLayout = new javax.swing.GroupLayout(jPanelImage);
        jPanelImage.setLayout(jPanelImageLayout);
        jPanelImageLayout.setHorizontalGroup(
            jPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelImageLayout.setVerticalGroup(
            jPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImageLayout.createSequentialGroup()
                .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(jPanelImage);

        jSplitPane1.setRightComponent(jSplitPane2);

        jPanelDetails.setBorder(javax.swing.BorderFactory.createTitledBorder("Personal Details"));

        jLabel1.setText("Name");

        jLabel2.setText("Phone Number");

        jLabel3.setText("Email");

        jLabel4.setText("Address");

        jTextFieldPhone.setEditable(false);

        jTextFieldEmail.setEditable(false);

        jTextFieldName.setEditable(false);

        jTextAreaAddress.setEditable(false);
        jTextAreaAddress.setColumns(20);
        jTextAreaAddress.setRows(5);
        jScrollPane2.setViewportView(jTextAreaAddress);

        javax.swing.GroupLayout jPanelDetailsLayout = new javax.swing.GroupLayout(jPanelDetails);
        jPanelDetails.setLayout(jPanelDetailsLayout);
        jPanelDetailsLayout.setHorizontalGroup(
            jPanelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldName)
                    .addComponent(jTextFieldPhone)
                    .addComponent(jTextFieldEmail)
                    .addGroup(jPanelDetailsLayout.createSequentialGroup()
                        .addGroup(jPanelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelDetailsLayout.setVerticalGroup(
            jPanelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanelDetails);

        javax.swing.GroupLayout jPanelContainerLayout = new javax.swing.GroupLayout(jPanelContainer);
        jPanelContainer.setLayout(jPanelContainerLayout);
        jPanelContainerLayout.setHorizontalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 814, Short.MAX_VALUE)
            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContainerLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jSplitPane1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanelSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanelContainerLayout.setVerticalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelContainerLayout.createSequentialGroup()
                            .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 58, Short.MAX_VALUE))
                        .addGroup(jPanelContainerLayout.createSequentialGroup()
                            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanelSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void sliderChanged() {
        if (jSlider.getValue() >= 0 && jSlider.getValue() < arrayList.size()) {
            loadFields(arrayList.get(jSlider.getValue()));
        }
    }

    private void loadData() {
        try {
            FileInputStream file = new FileInputStream("phonebook.dat");
            ObjectInputStream in = new ObjectInputStream(file);

            // read file onto global variable Person p
            while (file.available() > 0) {
                person = (Person) in.readObject();
                arrayList.add(person);
            }

            in.close();
            file.close();

            loadFields(person);
        } catch (Exception e) {
            // System.out.println(e.getMessage());
        }
    }

    private void makeDirectories() {
        File images = new File("images");
        File export = new File("export");
        File datFile = new File("phonebook.dat");

        // if the directory images does not exist, create it
        if (!images.exists()) {
            System.out.println("creating directory: " + images.getName());
            boolean result = false;

            try {
                images.mkdir();
                result = true;
            } catch (SecurityException se) {
                //handle it
            }
            if (result) {
                System.out.println("DIR created");
            }
        }

        // if the directory export does not exist, create it
        if (!export.exists()) {
            System.out.println("creating directory: " + export.getName());
            boolean result = false;

            try {
                export.mkdir();
                result = true;
            } catch (SecurityException se) {
                //handle it
            }
            if (result) {
                System.out.println("DIR created");
            }
        }

        // if the directory export does not exist, create it
        if (!datFile.exists()) {
            try {
                if (datFile.createNewFile()) {
                    System.out.println("File is created!");
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void loadFields(Person p) {
        // set write data on texfields
        jTextFieldName.setText(p.getName());
        jTextFieldPhone.setText(p.getPhone());
        jTextFieldEmail.setText(p.getEmail());
        jTextAreaAddress.setText(p.getAddress());
        jTextAreaNotes.setText(p.getNotes());
        jLabelImage.setIcon(p.getImage());
    }

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        jTextFieldName.setText("");
        jTextFieldPhone.setText("");
        jTextFieldEmail.setText("");
        jTextAreaAddress.setText("");
        jTextAreaNotes.setText("");
        jLabelImage.setIcon(null);
        iconName = "";

        setEditableTrue();

        isNew = true;
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void setEditableTrue() {
        jTextFieldName.setEditable(true);
        jTextFieldPhone.setEditable(true);
        jTextFieldEmail.setEditable(true);
        jTextAreaAddress.setEditable(true);
        jTextAreaNotes.setEditable(true);
    }

    private void setEditableFalse() {
        jTextFieldName.setEditable(false);
        jTextFieldPhone.setEditable(false);
        jTextFieldEmail.setEditable(false);
        jTextAreaAddress.setEditable(false);
        jTextAreaNotes.setEditable(false);
    }

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        Person person = new Person(jTextFieldName.getText(), jTextFieldPhone.getText(),
                jTextFieldEmail.getText(), jTextAreaAddress.getText(), jTextAreaNotes.getText(), jLabelImage.getIcon(), iconName);

        if (isNew == true) {
            try {
                FileOutputStream file = new FileOutputStream("phonebook.dat");
                ObjectOutputStream out = new ObjectOutputStream(file);

                arrayList.add(person);

                for (int i = 0; i < arrayList.size(); i++) {
                    out.writeObject(arrayList.get(i));
                }

                System.out.println("Array list size after new save = " + arrayList.size());
                System.out.println(person.getImage());

                out.close();
                file.close();

                setEditableFalse();

                jSlider.setMaximum(arrayList.size() - 1);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            // copy image
            if (isNewImage == true) {
                if (person.getImage() != null) {
                    try {
                        copyImage();
                        System.out.println("Image copied successfuly");
                    } catch (IOException ex) {
                        Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                isNewImage = false;
            }

            isNew = false;
        } else if (isEdit == true) {
            try {
                FileOutputStream file = new FileOutputStream("phonebook.dat");
                ObjectOutputStream out = new ObjectOutputStream(file);

                arrayList.set(jSlider.getValue(), person);

                for (int i = 0; i < arrayList.size(); i++) {
                    out.writeObject(arrayList.get(i));
                }

                System.out.println("Array list size after edit = " + arrayList.size());

                out.close();
                file.close();

                setEditableFalse();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            // copy image
            if (isNewImage == true) {
                if (person.getImage() != null) {
                    try {
                        copyImage();
                        System.out.println("Image copied successfuly");
                    } catch (IOException ex) {
                        Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                isNewImage = false;
            }

            isEdit = false;
        } else {
            // TODO: show dialog nothing to save
            // TODO: fix slider bar not reloading data if there is no phonebook file
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void loadImage(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadImage
        if (isNew == true || isEdit == true) {
            iconName = "";
            jFileChooser = new JFileChooser();

            if (jFileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                iconName = jFileChooser.getSelectedFile().getName();
                ImageIcon image = new ImageIcon(jFileChooser.getSelectedFile().getAbsolutePath());

                ImageIcon imageIcon = new ImageIcon(image.getImage().getScaledInstance(-1, jLabelImage.getHeight(), Image.SCALE_DEFAULT));
                jLabelImage.setIcon(imageIcon);

                isNewImage = true;
            }
        }
    }//GEN-LAST:event_loadImage

    public void copyImage() throws IOException {
        File file = new File(jFileChooser.getSelectedFile().getAbsolutePath());
        File destinationDir = new File("images");

        FileUtils.copyFileToDirectory(file, destinationDir);
    }

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        iconName = arrayList.get(jSlider.getValue()).getIconName();

        setEditableTrue();
        isEdit = true;
        //TODO: cancel button
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure?", "Warning", JOptionPane.YES_NO_OPTION);

        if (dialogResult == JOptionPane.YES_OPTION) {
            arrayList.remove(jSlider.getValue());

            try {
                FileOutputStream file = new FileOutputStream("phonebook.dat");
                ObjectOutputStream out = new ObjectOutputStream(file);

                for (int i = 0; i < arrayList.size(); i++) {
                    out.writeObject(arrayList.get(i));
                }

                System.out.println("Array list size after new save = " + arrayList.size());

                out.close();
                file.close();

                setEditableFalse();

                jSlider.setMaximum(arrayList.size() - 1);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
       PrinterJob job = PrinterJob.getPrinterJob();
            job.setJobName("Print Data");
            
            job.setPrintable(new Printable(){
            public int print(Graphics pg,PageFormat pf, int pageNum){
                    pf.setOrientation(PageFormat.PORTRAIT);
                    
                 if(pageNum>0){
                    return Printable.NO_SUCH_PAGE;
                }                
                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.50,0.50);
                g2.translate(175,100);                
                
                jPanelContainer.paint(g2);
          
                return Printable.PAGE_EXISTS;                       
                
            }           
    });
         
        boolean ok = job.printDialog();
        if(ok){
        try{
            
        job.print();
        }
        catch (PrinterException ex){}
        }
    }//GEN-LAST:event_jButtonPrintActionPerformed

    private void jButtonExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportActionPerformed
        DocumentBuilderFactory documentbuilderfactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = null;

        try {
            documentBuilder = documentbuilderfactory.newDocumentBuilder();
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }

        org.w3c.dom.Document document = documentBuilder.newDocument();

        document.setXmlStandalone(true);
        Element rootElement = document.createElement("Contact");
        document.appendChild(rootElement);

        for (int i = 0; i < arrayList.size(); i++) {

            Element personElement = document.createElement("PersonDetails");
            //personElement.setAttribute("id", "" + tab[i].getId());
            rootElement.appendChild(personElement);

            Element name = document.createElement("Name");
            if (arrayList.get(i).getName().isEmpty()) {
                name.appendChild(document.createTextNode("This contact has no name"));
            } else {
                name.appendChild(document.createTextNode(arrayList.get(i).getName()));
            }
            personElement.appendChild(name);

            Element phone = document.createElement("Phone");
            if (arrayList.get(i).getPhone().isEmpty()) {
                phone.appendChild(document.createTextNode("This contact has no phone"));
            } else {
                phone.appendChild(document.createTextNode(arrayList.get(i).getPhone()));
            }
            personElement.appendChild(phone);

            Element email = document.createElement("Email");
            if (arrayList.get(i).getEmail().isEmpty()) {
                email.appendChild(document.createTextNode("This contact has no email"));
            } else {
                email.appendChild(document.createTextNode(arrayList.get(i).getEmail()));
            }
            personElement.appendChild(email);

            Element address = document.createElement("Address");
            if (arrayList.get(i).getAddress().isEmpty()) {
                address.appendChild(document.createTextNode("This contact has no address"));
            } else {
                address.appendChild(document.createTextNode(arrayList.get(i).getAddress()));
            }
            personElement.appendChild(address);

            Element iconName = document.createElement("ImageName");
            if (arrayList.get(i).getIconName().isEmpty()) {
                iconName.appendChild(document.createTextNode("This contact has no photo"));
            } else {
                iconName.appendChild(document.createTextNode(arrayList.get(i).getIconName()));
            }
            personElement.appendChild(iconName);

            Element notes = document.createElement("Notes");
            if (arrayList.get(i).getNotes().isEmpty()) {
                notes.appendChild(document.createTextNode("This contact has no notes"));
            } else {
                notes.appendChild(document.createTextNode(arrayList.get(i).getNotes()));
            }
            personElement.appendChild(notes);
        }

        TransformerFactory transformerfactory = TransformerFactory.newInstance();
        Transformer transformer = null;
        try {
            transformer = transformerfactory.newTransformer();
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }

        //---Save file
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");

        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            System.out.println("Save as file: " + fileToSave.getAbsolutePath());

            DOMSource source = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(fileToSave.getAbsolutePath() + ".xml"));

            try {
                transformer.transform(source, streamResult);
            } catch (TransformerException ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //---
    }//GEN-LAST:event_jButtonExportActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonExport;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JPanel jPanelContainer;
    private javax.swing.JPanel jPanelDetails;
    private javax.swing.JPanel jPanelImage;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelNotes;
    private javax.swing.JPanel jPanelSlider;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JSlider jSlider;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTextArea jTextAreaAddress;
    private javax.swing.JTextArea jTextAreaNotes;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    // our variables
    JFileChooser jFileChooser;
    private boolean isNew = false;
    private boolean isEdit = false;
    private boolean isNewImage = false;
    private String iconName = "";
    private Person person;
    private ArrayList<Person> arrayList = new ArrayList<Person>();
}
