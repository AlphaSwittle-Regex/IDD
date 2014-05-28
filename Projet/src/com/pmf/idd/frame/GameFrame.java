package com.pmf.idd.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.pmf.idd.button.JChoiceButton;
import com.pmf.idd.level.Flags;
import com.pmf.idd.level.Level;

public class GameFrame extends JFrame
{
	private JButton f = new JChoiceButton(), s = new JChoiceButton(), t = new JChoiceButton();
	private JButton skipButton = new JButton("Skip");

	private long retries;

	private Level currentLevel;
	private Flags currentFlags;

	private int currentStage = 0;

	private JLabel flabel_l = new JLabel(">>> ");
	private JLabel slabel_l = new JLabel(">>> ");
	private JLabel tlabel_l = new JLabel(">>> ");

	private JLabel flabel_r = new JLabel(" <<<");
	private JLabel slabel_r = new JLabel(" <<<");
	private JLabel tlabel_r = new JLabel(" <<<");

	public GameFrame()
	{
		super("Reconstitute the events chronology !");
		setSize(1040, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel b0 = new JPanel();
		b0.setLayout(new BoxLayout(b0, BoxLayout.LINE_AXIS));

		JPanel b1 = new JPanel();
		b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));

		JPanel b2 = new JPanel();
		b2.setLayout(new BoxLayout(b2, BoxLayout.LINE_AXIS));

		JPanel b3 = new JPanel();
		b3.setLayout(new BoxLayout(b3, BoxLayout.PAGE_AXIS));

		b3.add(Box.createVerticalStrut(60));
		b3.add(b0);
		b3.add(Box.createVerticalStrut(25));
		b3.add(b1);
		b3.add(Box.createVerticalStrut(25));
		b3.add(b2);
		b3.add(Box.createVerticalStrut(25));
		b3.add(Box.createVerticalStrut(10));

		b0.add(flabel_l);
		b0.add(f);
		b0.add(flabel_r);

		b1.add(slabel_l);
		b1.add(s);
		b1.add(slabel_r);

		b2.add(tlabel_l);
		b2.add(t);
		b2.add(tlabel_r);

		setLayout(new BorderLayout());

		getContentPane().add(b3, BorderLayout.CENTER);
		getContentPane().add(skipButton, BorderLayout.SOUTH);

		String retriesValue = JOptionPane.showInputDialog(this, "How many retries ?", "Retries value");
		retries = Long.valueOf(retriesValue);

		addListeners();

		updateLevel(currentStage);
		updateButton(currentLevel, currentFlags);
	}

	public void addListeners()
	{
		f.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				if (((JChoiceButton) event.getSource()).isSuccess())
				{
					currentStage = currentLevel.getId() + 1;
					updateLevel(currentStage);
					updateButton(currentLevel, currentFlags);
				} else
				{
					actionWrong();
				}
			}
		});

		s.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				if (((JChoiceButton) event.getSource()).isSuccess())
				{
					currentStage = currentLevel.getId() + 1;
					updateLevel(currentStage);
					updateButton(currentLevel, currentFlags);
				} else
				{
					actionWrong();
				}
			}
		});

		t.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				if (((JChoiceButton) event.getSource()).isSuccess())
				{
					currentStage = currentLevel.getId() + 1;
					updateLevel(currentStage);
					updateButton(currentLevel, currentFlags);
				} else
				{
					actionWrong();
				}
			}
		});

		skipButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				currentStage = currentLevel.getId() + 1;
				updateLevel(currentStage);
				updateButton(currentLevel, currentFlags);
			}
		});
	}

	public void updateLevel(int updateNode)
	{
		switch (updateNode)
		{
		case 0:
			currentLevel = new Level(updateNode, "Immolation de Mohamed Bouazizi par le feu", "Discours de Ben Ali qui promet des solutions", "Grève générale de trois jours organisée par l'UGTT");
			currentFlags = new Flags(true, false, false);
			break;
		case 1:
			currentLevel = new Level(updateNode, "Grève générale de trois jours organisée par l'UGTT", "Limogeage du ministre de l'intérieur et du développement local Rafik Belhaj Kacem", "Discours de Ben Ali qui promet des solutions");
			currentFlags = new Flags(false, false, true);
			break;
		case 2:
			currentLevel = new Level(updateNode, "Limogeage du ministre de l'intérieur et du développement local Rafik Belhaj Kacem", "Grève générale de trois jours organisée par l'UGTT", "Couvre-feu sur le Grand-Tunis de 20H00 à 05H00");
			currentFlags = new Flags(false, true, false);
			break;
		case 3:
			currentLevel = new Level(updateNode, "Couvre-feu sur le Grand-Tunis de 20H00 à 05H00", "Discours de Ben Ali qui annonce la dissolution du gouvernement et l'organisation d'élections législatives", "Limogeage du ministre de l'intérieur et du développement local Rafik Belhaj Kacem");
			currentFlags = new Flags(false, false, true);
			break;
		case 4:
			currentLevel = new Level(updateNode, "Manifestations par des milliers de manifestants à l'avenue Habib Bourguiba revendiquant le départ de Ben Ali", "Discours de Ben Ali qui annonce la dissolution du gouvernement et l'organisation d'élections législatives", "Couvre-feu sur le Grand-Tunis de 20H00 à 05H00");
			currentFlags = new Flags(false, false, true);
			break;
		case 5:
			currentLevel = new Level(updateNode, "Fuite de Ben Ali et de son épouse en Arabie Saoudite", "Discours de Ben Ali qui annonce la dissolution du gouvernement et l'organisation d'élections législatives", "Manifestations par des milliers de manifestants à l'avenue Habib Bourguiba revendiquant le départ de Ben Ali");
			currentFlags = new Flags(false, true, false);
			break;
		case 6:
			currentLevel = new Level(updateNode, "Manifestations par des milliers de manifestants à l'avenue Habib Bourguiba revendiquant le départ de Ben Ali", "Fuite de Ben Ali et de son épouse en Arabie Saoudite", "Couvre-feu dans tout le pays de 17H00 à 07H00");
			currentFlags = new Flags(true, false, false);
			break;
		case 7:
			currentLevel = new Level(updateNode, "Fuite de Ben Ali et de son épouse en Arabie Saoudite", "Nomination de Foued Mebazza pour le poste de président de la république", "Couvre-feu dans tout le pays de 17H00 à 07H00");
			currentFlags = new Flags(true, false, false);
			break;
		case 8:
			currentLevel = new Level(updateNode, "Constitution d'un nouveau gouvernement avec écartement des symboles de l'ancien régime", "Couvre-feu dans tout le pays de 17H00 à 07H00", "Nomination de Foued Mebazza pour le poste de président de la république");
			currentFlags = new Flags(false, true, false);
			break;
		case 9:
			currentLevel = new Level(updateNode, "Constitution d'un nouveau gouvernement avec écartement des symboles de l'ancien régime", "Nomination de Foued Mebazza pour le poste de président de la république", "Retour à Tunis de Rached Ghannouchi, président du mouvement Ennahdha de son exil en Angleterre");
			currentFlags = new Flags(false, true, false);
			break;
		case 10:
			currentLevel = new Level(updateNode, "Organisation \"d'El Kasbah 2\" pour revendiquer la démission de Mohamed Ghannouchi et la création de l'Assemblée Nationale Constituante", "Retour à Tunis de Rached Ghannouchi, président du mouvement Ennahdha de son exil en Angleterre", "Constitution d'un nouveau gouvernement avec écartement des symboles de l'ancien régime");
			currentFlags = new Flags(false, false, true);
			break;
		case 11:
			currentLevel = new Level(updateNode, "Retour à Tunis de Rached Ghannouchi, président du mouvement Ennahdha de son exil en Angleterre", "Organisation \"d'El Kasbah 2\" pour revendiquer la démission de Mohamed Ghannouchi et la création de l'Assemblée Nationale Constituante", "Formation d'un nouveau gouvernement de technocrates");
			currentFlags = new Flags(true, false, false);
			break;
		case 12:
			currentLevel = new Level(updateNode, "Organisation \"d'El Kasbah 2\" pour revendiquer la démission de Mohamed Ghannouchi et la création de l'Assemblée Nationale Constituante", "Dissolution de RCD et autorisations pour la créations de nouveaux partis", "Formation d'un nouveau gouvernement de technocrates");
			currentFlags = new Flags(true, false, false);
			break;
		}
	}

	public void updateButton(Level level, Flags flags)
	{
		f.setText(level.getFirstNode());
		s.setText(level.getSecondNode());
		t.setText(level.getThirdNode());

		((JChoiceButton) f).setSuccess(flags.isFirstBool());
		((JChoiceButton) s).setSuccess(flags.isSecondBool());
		((JChoiceButton) t).setSuccess(flags.isThirdBool());
	}

	public void actionWrong()
	{
		retries--;
		if (retries == 0)
		{
			actionLose();
			return;
		}
		JOptionPane.showMessageDialog(this, "That answer is wrong !\nRetries left : " + retries, "Wrong !", JOptionPane.ERROR_MESSAGE);
	}

	public void actionLose()
	{
		JOptionPane.showMessageDialog(this, "You lost !", "Finish !", JOptionPane.ERROR_MESSAGE);
		System.exit(0);
	}
}
