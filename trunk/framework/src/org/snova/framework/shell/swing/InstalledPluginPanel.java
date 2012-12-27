/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PluginPanel.java
 *
 * Created on 2010-8-14, 9:45:42
 */
package org.snova.framework.shell.swing;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.snova.framework.util.SharedObjectHelper;

/**
 * 
 * @author wqy
 */
public class InstalledPluginPanel extends javax.swing.JPanel
{

	/** Creates new form PluginPanel */
	public InstalledPluginPanel(MainFrame owner, ProxyGUIHolder plugin)
	{
		this.plugin = plugin;
		this.owner = owner;
		initComponents();
		setButtonsVisible(false);
		allPluginPanels.add(this);

		if (plugin.getIcon() != null)
		{
			iconLabel.setIcon(plugin.getIcon());
		}
		configButton.setEnabled(true);
		descLabel.setText(plugin.getDesc());
		setPluginManageButtonStatus();
	}

	private void setPluginManageButtonStatus()
	{
		// if (plugin.state.equals(PluginState.ACTIVATED))
		// {
		// pluginLifeButton.setIcon(ImageUtil.DISABLE);
		// pluginLifeButton.setText("Disable");
		// }
		// else
		{
			pluginLifeButton.setIcon(ImageUtil.OK);
			pluginLifeButton.setText("Enable");
		}
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents()
	{

		configButton = new javax.swing.JButton();
		pluginLifeButton = new javax.swing.JButton();
		iconLabel = new javax.swing.JLabel();
		descLabel = new javax.swing.JLabel();
		removeButton = new javax.swing.JButton();

		setBorder(javax.swing.BorderFactory.createTitledBorder((plugin
		        .getName())));
		addMouseListener(new java.awt.event.MouseAdapter()
		{
			public void mouseClicked(java.awt.event.MouseEvent evt)
			{
				//formMouseClicked(evt);
			}
		});

		configButton.setText("Config");
		configButton.setIcon(ImageUtil.CONFIG);
		configButton.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				configButtonActionPerformed(evt);
			}
		});

		pluginLifeButton.setIcon(ImageUtil.DISABLE);
		pluginLifeButton.setText("Disable");
		pluginLifeButton.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				pluginLifeButtonActionPerformed(evt);
			}
		});

		iconLabel.setIcon(ImageUtil.PLUGIN32);

		descLabel.setText("jLabel2");
		descLabel.setAutoscrolls(true);
		descLabel.addMouseListener(new java.awt.event.MouseAdapter()
		{
			public void mouseClicked(java.awt.event.MouseEvent evt)
			{
				descLabelMouseClicked(evt);
			}
		});

		removeButton.setIcon(ImageUtil.REMOVE);
		removeButton.setText("Remove");
		removeButton.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				removeButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
		        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		        .addGroup(
		                layout.createSequentialGroup()
		                        .addComponent(iconLabel,
		                                javax.swing.GroupLayout.PREFERRED_SIZE,
		                                36,
		                                javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(
		                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addGroup(
		                                layout.createParallelGroup(
		                                        javax.swing.GroupLayout.Alignment.LEADING)
		                                        .addGroup(
		                                                layout.createSequentialGroup()
		                                                        .addComponent(
		                                                                configButton)
		                                                        .addPreferredGap(
		                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                                        .addComponent(
		                                                                pluginLifeButton,
		                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
		                                                                99,
		                                                                Short.MAX_VALUE)
		                                                        .addPreferredGap(
		                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                                        .addComponent(
		                                                                removeButton,
		                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
		                                                                96,
		                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
		                                        .addComponent(
		                                                descLabel,
		                                                javax.swing.GroupLayout.DEFAULT_SIZE,
		                                                252, Short.MAX_VALUE))
		                        .addContainerGap()));
		layout.setVerticalGroup(layout
		        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		        .addGroup(
		                layout.createSequentialGroup()
		                        .addGroup(
		                                layout.createParallelGroup(
		                                        javax.swing.GroupLayout.Alignment.LEADING)
		                                        .addGroup(
		                                                layout.createSequentialGroup()
		                                                        .addComponent(
		                                                                descLabel,
		                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
		                                                                15,
		                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                        .addGap(18, 18,
		                                                                18)
		                                                        .addGroup(
		                                                                layout.createParallelGroup(
		                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
		                                                                        .addComponent(
		                                                                                configButton)
		                                                                        .addComponent(
		                                                                                pluginLifeButton)
		                                                                        .addComponent(
		                                                                                removeButton)))
		                                        .addComponent(
		                                                iconLabel,
		                                                javax.swing.GroupLayout.PREFERRED_SIZE,
		                                                36,
		                                                javax.swing.GroupLayout.PREFERRED_SIZE))
		                        .addContainerGap()));
	}// </editor-fold>//GEN-END:initComponents

	private void formMouseClicked(java.awt.event.MouseEvent evt)
	{// GEN-FIRST:event_formMouseClicked
		setButtonsVisible(true);
		for (InstalledPluginPanel other : allPluginPanels)
		{
			if (other != this)
			{
				other.setButtonsVisible(false);
			}
		}

	}// GEN-LAST:event_formMouseClicked

	private void configButtonActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_configButtonActionPerformed
		if (null != plugin.getConfigPanel())
		{
			try
			{
				new PluginConfigDialog(owner, plugin).setVisible(true);
			}
			catch (Throwable e)
			{
				logger.error("######", e);
			}

		}
		else
		{
			// TUIPlugin tp = (TUIPlugin) plugin.plugin;
			// tp.onConfig();
		}
	}// GEN-LAST:event_configButtonActionPerformed

	private void pluginLifeButtonActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_pluginLifeButtonActionPerformed
		// TODO add your handling code here:
		SharedObjectHelper.getGlobalThreadPool().submit(new Runnable()
		{

			public void run()
			{
				// do nothing
			}
		});

	}// GEN-LAST:event_pluginLifeButtonActionPerformed

	private void removeButtonActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_removeButtonActionPerformed
		SharedObjectHelper.getGlobalThreadPool().submit(new Runnable()
		{
			public void run()
			{
				// do nothing
			}
		});
	}// GEN-LAST:event_removeButtonActionPerformed

	private void descLabelMouseClicked(java.awt.event.MouseEvent evt)
	{// GEN-FIRST:event_descLabelMouseClicked
		formMouseClicked(evt);
	}// GEN-LAST:event_descLabelMouseClicked

	private void setButtonsVisible(boolean isVisible)
	{
		configButton.setVisible(isVisible);
		pluginLifeButton.setVisible(isVisible);
		removeButton.setVisible(isVisible);
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton configButton;
	private javax.swing.JLabel descLabel;
	private javax.swing.JLabel iconLabel;
	private javax.swing.JButton pluginLifeButton;
	private javax.swing.JButton removeButton;
	// End of variables declaration//GEN-END:variables
	private ProxyGUIHolder plugin;
	private MainFrame owner;
	private static List<InstalledPluginPanel> allPluginPanels = new ArrayList<InstalledPluginPanel>();
	protected Logger logger = LoggerFactory.getLogger(getClass());
}
