package finalproject_test2;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.concurrent.ThreadLocalRandom;

import finalproject_test2.main_test2;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;



public class menucontroller {
	  @FXML
	    private Pane menu;

	  	@FXML
	  	private ImageView background;
	  	
	    @FXML
	    private Button throwcoin;

	    @FXML
	    private Button shop;

	    @FXML
	    private Button throwdice;

	    @FXML
	    private Button point_21;

	    @FXML
	    private Button slot;

	    @FXML
	    private Label currentmoney;

	    @FXML
	    private Label money;
	    
	    @FXML
	    private Button horse_race_button;

	    int game_type=0;


	    @FXML
	    public void leave() throws IOException{
	    	main_test2.currentStage.close();
	    }
	    
	    @FXML
	    void press_horse_race() {
	    	back.setVisible(true);
			game_type = 5;
			betmoney.setVisible(true);
			menu.setVisible(false);
	    }

	    @FXML
	    void press_point_21() {
	    	back.setVisible(true);
			game_type = 3;
			betmoney.setVisible(true);
			menu.setVisible(false);
			
	    }

	    @FXML
	    void press_slot() {
	    	back.setVisible(true);
			game_type = 4;
			slot_rule.setVisible(true);
			menu.setVisible(false);
	    }

	    @FXML
	    void press_throw_coin() {
	    	back.setVisible(true);
			game_type = 1;
			betmoney.setVisible(true);
			menu.setVisible(false);
			
	    }

	    @FXML
	    void press_throw_dice() {
			back.setVisible(true);
			game_type = 2;
			betmoney.setVisible(true);
			menu.setVisible(false);
			
	    }

	    @FXML
	    private Pane shop_pane;
	    
	    @FXML
	    private Button buy1;
	    
	    @FXML
	    private RadioButton choice1;
	    
	    @FXML
	    private Button buy2;
	    
	    @FXML
	    private RadioButton choice2;
	    
	    @FXML
	    private Button buy3;
	    
	    @FXML
	    private RadioButton choice3;
	    
	    @FXML
	    private Button buy4;
	    
	    @FXML
	    private RadioButton choice4;
	    
	    @FXML
	    private Button buy5;
	    
	    @FXML
	    private RadioButton choice5;
	    
	    @FXML
	    private Button back9;
	    
	    @FXML
	    void shop() {
	    	menu.setVisible(false);
	    	shop_pane.setVisible(true);
	    }
	    
	    
	    
	    //shop
	    @FXML
	    	void gobacktomenu_shop() {
	    	if(main_test2.cash_value == 0)
			{
				throwcoin.setDisable(true);
				throwdice.setDisable(true);
				point_21.setDisable(true);
				slot.setDisable(true);
				shop.setDisable(true);
				horse_race_button.setDisable(true);
			}
	    	shop_pane.setVisible(false);
	    	menu.setVisible(true);
	    }
	    @FXML
	    void buy1() {
	    	if(main_test2.cash_value>=1000)
	    	{
	    	buy1.setVisible(false);
	    	main_test2.cash_value-=1000;
	    	main_test2.cash1 = Integer.toString(main_test2.cash_value);
			money.setText(main_test2.cash1);
	    	}
	    }
	    @FXML
	    void choice1() {
	    	InputStream background1 = getClass().getResourceAsStream("background1.png");
			Image pic1=new Image(background1);
	    	background.setImage(pic1);
	    }
	    
	    @FXML
	    void buy2() {
	    	if(main_test2.cash_value>=1000)
	    	{
	    	buy2.setVisible(false);
	    	main_test2.cash_value-=1000;
	    	main_test2.cash1 = Integer.toString(main_test2.cash_value);
			money.setText(main_test2.cash1);
	    	}
	    }
	    @FXML
	    void choice2() {
	    	InputStream background2 = getClass().getResourceAsStream("background2.jpg");
			Image pic2=new Image(background2);
	    	background.setImage(pic2);
	    }
	    @FXML
	    void buy3() {
	    	if(main_test2.cash_value>=1000)
	    	{
	    	buy3.setVisible(false);
	    	main_test2.cash_value-=1000;
	    	main_test2.cash1 = Integer.toString(main_test2.cash_value);
			money.setText(main_test2.cash1);
	    	}
	    }
	    @FXML
	    void choice3() {
	    	InputStream background3 = getClass().getResourceAsStream("background3.jpg");
			Image pic3=new Image(background3);
	    	background.setImage(pic3);
	    }
	    @FXML
	    void buy4() {
	    	if(main_test2.cash_value>=1000)
	    	{
	    	buy4.setVisible(false);
	    	main_test2.cash_value-=1000;
	    	main_test2.cash1 = Integer.toString(main_test2.cash_value);
			money.setText(main_test2.cash1);
	    	}
	    }
	    @FXML
	    void choice4() {
	    	InputStream background4 = getClass().getResourceAsStream("background5.jpeg");
			Image pic4=new Image(background4);
	    	background.setImage(pic4);
	    }
	    @FXML
	    void buy5() {
	    	if(main_test2.cash_value>=1000)
	    	{
	    	buy5.setVisible(false);
	    	main_test2.cash_value-=1000;
	    	main_test2.cash1 = Integer.toString(main_test2.cash_value);
			money.setText(main_test2.cash1);
	    	}
	    }
	    @FXML
	    void choice5() {
	    	InputStream background5 = getClass().getResourceAsStream("background6.jpeg");
			Image pic5=new Image(background5);
	    	background.setImage(pic5);
	    }
	    
	    //bet money
	    @FXML
	    private Button back;
	    
	    @FXML
	    private Pane betmoney;

	    @FXML
	    private TextField cash;
	    
		int bet_money=0;
		
	    @FXML
	    void gobacktomenu_betmoney() {
	    	betmoney.setVisible(false);
	    	menu.setVisible(true);
	    }
	    
	    @FXML
	    void sure() {
	    	if(Integer.valueOf(cash.getText())>main_test2.cash_value)
	    	{
	    		bet_money = main_test2.cash_value;
	    	}
	    	else
	    	{
	    		bet_money = Integer.valueOf(cash.getText());
	    	}
	    	if(game_type == 1)
	    	{
	    		throw_coin_rule.setVisible(true);
	    		betmoney.setVisible(false);
	    	}
	    	
	    	else if(game_type == 2)
	    	{
	        	betmoney.setVisible(false);
	        	throw_dice_rule.setVisible(true);
	    	}
	    	else if(game_type == 3)
	    	{
	    		betmoney.setVisible(false);
	    		point_21_rule.setVisible(true);
	    	}
	    	else if(game_type == 5)
	    	{
	    		betmoney.setVisible(false);
	    		horse_race_rule.setVisible(true);
	    	}
	    }
	    
	    
	    //throw coin rule

	    @FXML
	    private Pane throw_coin_rule;
	    
	    @FXML
	    private Button next_coin;

	    @FXML
	    private Button back1;

	    @FXML
	    void gobacktomenu_coin_rule() {
	    	throw_coin_rule.setVisible(false);
	    	menu.setVisible(true);
	    	
	    }

	    @FXML
	    void next_coin() {
	    	throwacoin.setVisible(true);
			throw_coin_rule.setVisible(false);
			back2.setVisible(false);
	    }
	    
	    
	    //throw coin
	    @FXML
	    private Pane throwacoin;

	    @FXML
	    private Button head_button;

	    @FXML
	    private Button word_button;

	    @FXML
	    private Button sure;

	    @FXML
	    private Label win;

	    @FXML
	    private Label lose;

	    @FXML
	    private Button back2;

	    @FXML
	    private ImageView coin_face;

	    @FXML
	    private ImageView coin_word;

	    @FXML
	    private Label nochoose;

	    @FXML
	    void gobacktomenu_coin() {
	    	if(main_test2.cash_value == 0)
			{
				throwcoin.setDisable(true);
				throwdice.setDisable(true);
				point_21.setDisable(true);
				slot.setDisable(true);
				shop.setDisable(true);
				horse_race_button.setDisable(true);
			}
	    	throwacoin.setVisible(false);
	    	menu.setVisible(true);
	    	main_test2.cash1 = Integer.toString(main_test2.cash_value);
			money.setText(main_test2.cash1);
			nochoose.setVisible(false);
			win.setVisible(false);
			lose.setVisible(false);
			sure.setDisable(false);
			head_button.setDisable(false);
			word_button.setDisable(false);
	    }

	    int head = 1;
	    int word = 0;
	    int ran = 2;
	    Random rand = new Random();
	    int choice = 0;
	    @FXML
	    public void head() {
	    	coin_face.setVisible(false);
	    	coin_word.setVisible(false);
	    	win.setVisible(false);
	    	lose.setVisible(false);
	    	nochoose.setVisible(false);
	    	choice = 1;
	    	ran = rand.nextInt(2);
	    }

	    @FXML
	    public void word() {
	    	coin_face.setVisible(false);
	    	coin_word.setVisible(false);
	    	win.setVisible(false);
	    	lose.setVisible(false);
	    	nochoose.setVisible(false);
	    	choice = 0;
	    	ran = rand.nextInt(2);
	    }
	    @FXML
	    public void ok() {
	    	final Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setTitle("小提示");
	    	alert.setHeaderText("當前金額及下注金額確認");
	    	alert.setContentText("您目前的金額是: "+(main_test2.cash_value-bet_money)+"   "+"您這次的賭金是: "+bet_money);
	    	alert.showAndWait();
	    	
	    	win.setVisible(false);
	    	lose.setVisible(false);
	    	nochoose.setVisible(false);
	    	if(ran == choice)
	    	{
	    		if(ran==1)
	    		{
	    			coin_face.setVisible(true);
	    		}
	    		else if(ran==0)
	    		{
	    			coin_word.setVisible(true);
	    		}
	    		win.setVisible(true);
	    		main_test2.cash_value += bet_money;
	    		ran=2;
	    	}
	    	else if(ran == 2)
	    	{
	    		coin_face.setVisible(false);
	        	coin_word.setVisible(false);
	    		nochoose.setVisible(true);
	    	}
	    	else 
	    	{
	    		if(ran==1)
	    		{
	    			coin_face.setVisible(true);
	    		}
	    		else if(ran==0)
	    		{
	    			coin_word.setVisible(true);
	    		}
	    		lose.setVisible(true);
	    		main_test2.cash_value -= bet_money;
	    		ran=2;
	    	}
	    	head_button.setDisable(true);
	    	word_button.setDisable(true);
	    	sure.setDisable(true);
	    	ran=2;
	    	back2.setVisible(true);
	    }
	    
	    
	    //throw dice rule

	    @FXML
	    private Pane throw_dice_rule;
	    
	    @FXML
	    private Button next_dice;

	    @FXML
	    private Button back3;

	    @FXML
	    void gobacktomenu_dice_rule() {
	    	throw_dice_rule.setVisible(false);
	    	menu.setVisible(true);
	    	main_test2.cash1 = Integer.toString(main_test2.cash_value);
			money.setText(main_test2.cash1);
	    }

	    @FXML
	    void next_dice() {
	    	throw_dice.setVisible(true);
			throw_dice_rule.setVisible(false);
			back4.setVisible(false);
	    }
	    
	    
	    //throw dice
	    @FXML
	    private Pane throw_dice;

	    @FXML
	    private ImageView p_dice1;

	    @FXML
	    private ImageView c_dice1;

	    @FXML
	    private ImageView p_dice2;

	    @FXML
	    private ImageView p_dice3;

	    @FXML
	    private ImageView p_dice4;

	    @FXML
	    private ImageView p_dice5;

	    @FXML
	    private ImageView p_dice6;

	    @FXML
	    private ImageView c_dice2;

	    @FXML
	    private ImageView c_dice3;

	    @FXML
	    private ImageView c_dice4;

	    @FXML
	    private ImageView c_dice5;

	    @FXML
	    private ImageView c_dice6;

	    @FXML
	    private Button start;

	    @FXML
	    private Button back4;

	    @FXML
	    private Label win1;

	    @FXML
	    private Label lose1;

	    @FXML
	    private Label draw;

	    @FXML
	    void gobacktomenu_dice() {
	    	if(main_test2.cash_value == 0)
			{
				throwcoin.setDisable(true);
				throwdice.setDisable(true);
				point_21.setDisable(true);
				slot.setDisable(true);
				shop.setDisable(true);
				horse_race_button.setDisable(true);
			}
	    	throw_dice.setVisible(false);
	    	menu.setVisible(true);
	    	main_test2.cash1 = Integer.toString(main_test2.cash_value);
			money.setText(main_test2.cash1);
			start.setDisable(false);
			p_dice1.setVisible(false);
			p_dice2.setVisible(false);
			p_dice3.setVisible(false);
			p_dice4.setVisible(false);
			p_dice5.setVisible(false);
			p_dice6.setVisible(false);
			c_dice1.setVisible(false);
			c_dice2.setVisible(false);
			c_dice3.setVisible(false);
			c_dice4.setVisible(false);
			c_dice5.setVisible(false);
			c_dice6.setVisible(false);
			win1.setVisible(false);
			lose1.setVisible(false);
			draw.setVisible(false);
	    }

	    @FXML
	    void press_start_dice() {
	    	final Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("小提示");
			alert.setHeaderText("當前金額及下注金額確認");
			alert.setContentText("您目前的金額是: "+(main_test2.cash_value-bet_money)+"   "+"您這次的賭金是: "+bet_money);
			alert.showAndWait();
			
			Random rand = new Random();
			int p_dice = rand.nextInt(6);
			int c_dice = rand.nextInt(6);
			int p_point = 0, c_point = 0;
			
			if(p_dice == 0 )
			{
				p_dice1.setVisible(true);
				p_point = 1;
			}
			else if(p_dice == 1)
			{
				p_dice2.setVisible(true);
				p_point = 2;
			}
			else if(p_dice == 2)
			{
				p_dice3.setVisible(true);
				p_point = 3;
			}
			else if(p_dice == 3)
			{
				p_dice4.setVisible(true);
				p_point = 4;
			}
			else if(p_dice == 4)
			{
				p_dice5.setVisible(true);
				p_point = 5;
			}
			else if(p_dice == 5)
			{
				p_dice6.setVisible(true);
				p_point = 6;
			}
			if(c_dice == 0)
			{
				c_dice1.setVisible(true);
				c_point = 1;
			}
			else if(c_dice == 1)
			{
				c_dice2.setVisible(true);
				c_point = 2;
			}
			else if(c_dice == 2)
			{
				c_dice3.setVisible(true);
				c_point = 3;
			}
			else if(c_dice == 3)
			{
				c_dice4.setVisible(true);
				c_point = 4;
			}
			else if(c_dice == 4)
			{
				c_dice5.setVisible(true);
				c_point = 5;
			}
			else if(c_dice == 5)
			{
				c_dice6.setVisible(true);
				c_point = 6;
			}
			if(p_point > c_point)
			{
				win1.setVisible(true);
				main_test2.cash_value += bet_money;
				start.setDisable(true);
			}
			else if(p_point < c_point)
			{
				lose1.setVisible(true);
				main_test2.cash_value -= bet_money;
				start.setDisable(true);
			}
			else if(p_point == c_point)
			{
				draw.setVisible(true);
				start.setDisable(true);
			}
			back4.setVisible(true);

	    }
	    
	    
	    //point 21 rule
	    @FXML
	    private Pane point_21_rule;

	    @FXML
	    private Button next_point21_rule;

	    @FXML
	    private Button back5;

	    @FXML
	    void gobacktomenu_point21_rule() {
	    	point_21_rule.setVisible(false);
	    	menu.setVisible(true);
	    	main_test2.cash1 = Integer.toString(main_test2.cash_value);
			money.setText(main_test2.cash1);
	    }

	    @FXML
	    void next_poinr21_rule() {
	    	point21.setVisible(true);
			point_21_rule.setVisible(false);
			back6.setVisible(false);
	    }
	    
	    
	    //point 21
	    @FXML
	    private Pane point21;

	    @FXML
	    private ImageView poker_back11;

	    @FXML
	    private ImageView poker_club_2;

	    @FXML
	    private ImageView poker_club_1;

	    @FXML
	    private ImageView poker_back;

	    @FXML
	    private ImageView poker_club_3;

	    @FXML
	    private ImageView poker_club_4;

	    @FXML
	    private ImageView poker_club_5;

	    @FXML
	    private ImageView poker_club_6;

	    @FXML
	    private ImageView poker_club_7;

	    @FXML
	    private ImageView poker_club_8;

	    @FXML
	    private ImageView poker_club_9;

	    @FXML
	    private ImageView poker_club_10;

	    @FXML
	    private ImageView poker_club_11;

	    @FXML
	    private ImageView poker_club_12;

	    @FXML
	    private ImageView poker_club_13;

	    @FXML
	    private ImageView poker_daimond_1;

	    @FXML
	    private ImageView poker_daimond_2;

	    @FXML
	    private ImageView poker_daimond_3;

	    @FXML
	    private ImageView poker_daimond_4;

	    @FXML
	    private ImageView poker_daimond_5;

	    @FXML
	    private ImageView poker_daimond_6;

	    @FXML
	    private ImageView poker_daimond_7;

	    @FXML
	    private ImageView poker_daimond_8;

	    @FXML
	    private ImageView poker_daimond_9;

	    @FXML
	    private ImageView poker_daimond_10;

	    @FXML
	    private ImageView poker_daimond_11;

	    @FXML
	    private ImageView poker_daimond_12;

	    @FXML
	    private ImageView poker_daimond_13;

	    @FXML
	    private ImageView poker_heart_1;

	    @FXML
	    private ImageView poker_heart_2;

	    @FXML
	    private ImageView poker_heart_3;

	    @FXML
	    private ImageView poker_heart_4;

	    @FXML
	    private ImageView poker_heart_5;

	    @FXML
	    private ImageView poker_heart_6;

	    @FXML
	    private ImageView poker_heart_7;

	    @FXML
	    private ImageView poker_heart_8;

	    @FXML
	    private ImageView poker_heart_9;

	    @FXML
	    private ImageView poker_heart_10;

	    @FXML
	    private ImageView poker_heart_11;

	    @FXML
	    private ImageView poker_heart_12;

	    @FXML
	    private ImageView poker_heart_13;

	    @FXML
	    private ImageView poker_spades_1;

	    @FXML
	    private ImageView poker_spades_2;

	    @FXML
	    private ImageView poker_spades_3;

	    @FXML
	    private ImageView poker_spades_4;

	    @FXML
	    private ImageView poker_spades_5;

	    @FXML
	    private ImageView poker_spades_6;

	    @FXML
	    private ImageView poker_spades_7;

	    @FXML
	    private ImageView poker_spades_8;

	    @FXML
	    private ImageView poker_spades_9;

	    @FXML
	    private ImageView poker_spades_10;

	    @FXML
	    private ImageView poker_spades_11;

	    @FXML
	    private ImageView poker_spades_12;

	    @FXML
	    private ImageView poker_spades_13;

	    @FXML
	    private ImageView poker_back1;

	    @FXML
	    private Button start1;

	    @FXML
	    private Label com;

	    @FXML
	    private Label player;

	    @FXML
	    private Button back6;

	    @FXML
	    private ImageView poker_back2;

	    @FXML
	    private Button draw1;

	    @FXML
	    private Button stand;

	    @FXML
	    private Button result;

	    @FXML
	    private Label result_word;
	    
	    int px=100,cy=10,p_y=350,cx=100;
	    double move_px=5,move_y=3.4,move_cx=5;
	    int total = 52;
	    int card=0;
	    int time_p=0,time_c=0;
	    int point_p=0,point_c=0,temp_point_c=0,temp_point=0;
	    int numberof1=0,numberof1_c=0;
	    int wait=0;
	    ArrayList<Integer> bb = new ArrayList();
	    ArrayList<ImageView> aa = new ArrayList();
	    ArrayList<ImageView> cc = new ArrayList();
	    
	    @FXML
	    void gobacktomenu_point21() {
	    	if(main_test2.cash_value == 0)
			{
				throwcoin.setDisable(true);
				throwdice.setDisable(true);
				point_21.setDisable(true);
				slot.setDisable(true);
				shop.setDisable(true);
				horse_race_button.setDisable(true);
			}
	    	point21.setVisible(false);
	    	menu.setVisible(true);
	    	main_test2.cash1 = Integer.toString(main_test2.cash_value);
			money.setText(main_test2.cash1);
			result_word.setVisible(false);
			reset_deck();
			com.setVisible(true);
			start1.setVisible(true);
	    	player.setVisible(true);
	    	px=100;
	    	cy=10;
	    	p_y=350;
	    	cx=100;
		    move_px=5;move_y=3.4;move_cx=5;
		    total = 52;
		    card=0;
		    time_p=0;time_c=0;
		   	point_p=0;point_c=0;temp_point_c=0;temp_point=0;
		    numberof1=0;numberof1_c=0;
		    wait=0;
		    cc.clear();
		    poker_back2.setVisible(false);
	    }
	    
	    
	    
	    @FXML
	    void press_start_point21() {
	    	temp_deck();
	    	back6.setVisible(false);
	    	final Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setTitle("小提示");
	    	alert.setHeaderText("當前金額及下注金額確認");
	    	alert.setContentText("您目前的金額是: "+(main_test2.cash_value-bet_money)+"   "+"您這次的賭金是: "+bet_money);
	    	alert.showAndWait();
	    	
	    	poker_back.setVisible(true);
	    	poker_back11.setVisible(true);
	    	poker_back1.setVisible(true);
	    	com.setVisible(false);
	    	player.setVisible(false);
	    	poker_back1.setLayoutX(poker_back.getLayoutX());
	    	poker_back1.setLayoutY(poker_back.getLayoutY());
	    	build_deck();
	    	start1.setVisible(false);
	    	move_p();
	    	move_c();
	    	move_p();
	    	move_c();
	    	draw1.setVisible(true);
	    	stand.setVisible(true);
	    }
	    @FXML
	    void press_draw() {
	    	move_p();
	    }

	    @FXML
	    void press_stand() {
			draw1.setVisible(false);
			stand.setVisible(false);
	    	poker_back2.setVisible(false);
	    	wait=1;
	    	if(temp_point_c<17)
	    	{
	    		
	    		move_c();
	    		
	    	}
	    	else
	    	{
	    		result.setVisible(true);
	    	}
	    	
	    	
	    }
	    @FXML
	    void press_result() {
	    	System.out.println(temp_point);
	    	System.out.println(temp_point_c);
	    	result.setVisible(false);
	    	back6.setVisible(true);
	    	if(numberof1>=1)
	    	{
	    		if(temp_point+10>21)
		    	{
		    		point_p=temp_point;
		    	}
		    	else
		    	{
		    		point_p=temp_point+10;
		    	}
	    	}
	    	else
	    	{
	    		point_p=temp_point;
	    	}
	    	if(time_p==5 && point_p<=21)
	    	{
	    		result_word.setText("你贏了");
	    		result_word.setVisible(true);
	    		draw1.setVisible(false);
	    		stand.setVisible(false);
	    		main_test2.cash_value += bet_money;
	    	}
	    	else if(temp_point_c<=21)
	    	{
		    	
		    	point_c=temp_point_c;
		    	if(point_p>21)
		    	{
		    		result_word.setText("你輸了");
		    		result_word.setVisible(true);
		    		main_test2.cash_value -= bet_money;
		    	}
		    	else if(point_p>point_c)
		    	{
		    		result_word.setText("你贏了");
		    		result_word.setVisible(true);
		    		draw1.setVisible(false);
		    		stand.setVisible(false);
		    		main_test2.cash_value += bet_money;
		    	}
		    	else if(point_p<point_c)
		    	{
		    		
		    		result_word.setText("你輸了");
		    		result_word.setVisible(true);
		    		draw1.setVisible(false);
		    		stand.setVisible(false);
		    		main_test2.cash_value -= bet_money;
		    	}
		    	else if(point_p==point_c)
		    	{
		    		result_word.setText("平 手");
		    		result_word.setVisible(true);
		    		draw1.setVisible(false);
		    		stand.setVisible(false);
		    	}
	    	}
	    	else if(temp_point_c>21)
	    	{
	    		result_word.setText("你贏了");
	    		result_word.setVisible(true);
	    		main_test2.cash_value += bet_money;
	    	}
	    	aa.clear();
			bb.clear();
			back6.setVisible(true);
			System.out.println(point_p);
			System.out.println(point_c);
			System.out.println();
	    }
	    void move_p() {
	    	Timeline movement = new Timeline(
	    			new KeyFrame(Duration.millis(7),
	    					(d)-> {
	    						
	    							poker_back1.setLayoutX(poker_back1.getLayoutX() - move_px);
	    							poker_back1.setLayoutY(poker_back1.getLayoutY() + move_y);
	    							if(poker_back1.getLayoutX() == px && poker_back1.getLayoutY() < p_y+0.5 && poker_back1.getLayoutY() > p_y-0.5)
	        						{
	        							give_card_p();
	        							if(time_p==5 && point_p<=21)
	        							{
	        					    		draw1.setVisible(false);
	        					    		stand.setVisible(false);
	        								result.setVisible(true);
	        							}
	        					    	
	        						}
	    					}));
	    			movement.setCycleCount(50);
	    			movement.play();
	    			
	    			
	    			
	    }
	    void move_c() {
	    	Timeline movement = new Timeline(
	    			new KeyFrame(Duration.millis(7),
	    					(d)-> {
	    							poker_back.setLayoutX(poker_back.getLayoutX() - move_cx);
	    							poker_back.setLayoutY(poker_back.getLayoutY() - move_y);
	    							if(poker_back.getLayoutX() == cx && poker_back.getLayoutY() < cy+0.5 && poker_back.getLayoutY() > cy-0.5)
	        						{
	    								int secondsToSleep=5;
	    								if(time_c==0)
	        							{
	        								poker_back2.setVisible(true);
	        							}
	        							give_card_c();
	        							if(temp_point_c<17 && wait==1)
	        							{
	        								
	        								move_c();
	        								result.setVisible(true);
	        							}
	        							else if(wait==1)
	        							{
	        								result.setVisible(true);
	        							}
	        							
	        						}
	    					}));
	    			movement.setCycleCount(50);
	    			movement.play();
	    		
	    }
	    void build_deck() {
	    	for(int i=0; i<52; i++)
	    	{
	    		bb.add(i);
	    	}
	    	aa.add(poker_club_1);
	    	aa.add(poker_daimond_1);
	    	aa.add(poker_heart_1);
	        aa.add(poker_spades_1);
	        aa.add(poker_club_2);
	    	aa.add(poker_daimond_2);
	    	aa.add(poker_heart_2);
	    	aa.add(poker_spades_2);
	    	aa.add(poker_club_3);
	    	aa.add(poker_daimond_3);
	    	aa.add(poker_heart_3);
	        aa.add(poker_spades_3);
	    	aa.add(poker_club_4);
	    	aa.add(poker_daimond_4);
	    	aa.add(poker_heart_4);
	    	aa.add(poker_spades_4);
	    	aa.add(poker_club_5);
	    	aa.add(poker_daimond_5);
	    	aa.add(poker_heart_5);
	    	aa.add(poker_spades_5);
	    	aa.add(poker_club_6);
	    	aa.add(poker_daimond_6);
	    	aa.add(poker_heart_6);
	    	aa.add(poker_spades_6);
	    	aa.add(poker_club_7);
	    	aa.add(poker_daimond_7);
	    	aa.add(poker_heart_7);
	    	aa.add(poker_spades_7);
	    	aa.add(poker_club_8);
	    	aa.add(poker_daimond_8);
	    	aa.add(poker_heart_8);
	    	aa.add(poker_spades_8);
	    	aa.add(poker_club_9);
	    	aa.add(poker_daimond_9);
	        aa.add(poker_heart_9);
	        aa.add(poker_spades_9);
	    	aa.add(poker_club_10);
	    	aa.add(poker_daimond_10);
	    	aa.add(poker_heart_10);
	    	aa.add(poker_spades_10);
	    	aa.add(poker_club_11);
	    	aa.add(poker_daimond_11);
	    	aa.add(poker_heart_11);
	    	aa.add(poker_spades_11);
	    	aa.add(poker_club_12);
	    	aa.add(poker_daimond_12);
	    	aa.add(poker_heart_12);
	    	aa.add(poker_spades_12);
	    	aa.add(poker_club_13);
	    	aa.add(poker_daimond_13);
	    	aa.add(poker_heart_13);
	        aa.add(poker_spades_13);
	    }
		void give_card_p() {
	    	card = rand.nextInt(total);
	    	aa.get(card).setLayoutX(px);
	    	aa.get(card).setLayoutY(p_y);
	    	aa.get(card).setVisible(true);
	    	if(bb.get(card)>=0 && bb.get(card)<=3)
	    	{
	    		temp_point+=1;
	    		numberof1+=1;
	    	}
	    	else if(bb.get(card)>=4 && bb.get(card)<=7)
	    	{
	    		temp_point+=2;
	    	}
	    	else if(bb.get(card)>=8 && bb.get(card)<=11)
	    	{
	    		temp_point+=3;
	    	}
	    	else if(bb.get(card)>=12 && bb.get(card)<=15)
	    	{
	    		temp_point+=4;
	    	}
	    	else if(bb.get(card)>=16 && bb.get(card)<=19)
	    	{
	    		temp_point+=5;
	    	}
	    	else if(bb.get(card)>=20 && bb.get(card)<=23)
	    	{
	    		temp_point+=6;
	    	}
	    	else if(bb.get(card)>=24 && bb.get(card)<=27)
	    	{
	    		temp_point+=7;
	    	}
	    	else if(bb.get(card)>=28 && bb.get(card)<=31)
	    	{
	    		temp_point+=8;
	    	}
	    	else if(bb.get(card)>=32 && bb.get(card)<=35)
	    	{
	    		temp_point+=9;
	    	}
	    	else 
	    	{
	    		temp_point+=10;
	    	}
	    	if(temp_point>21)
	    	{
	    		point_p = temp_point;
	    		result.setVisible(true);
	    	}
	    	bb.remove(card);
	    	aa.remove(card);
	    	total-=1;
	    	px+=125;
	    	move_px-=2.5;
	    	poker_back1.setLayoutX(350);
			poker_back1.setLayoutY(180);
			time_p+=1;
	    }
	    void give_card_c() {
	    	card = rand.nextInt(total);
	    	aa.get(card).setLayoutX(cx);
	    	aa.get(card).setLayoutY(cy);
	    	aa.get(card).setVisible(true);
	    	if(bb.get(card)>=0 && bb.get(card)<=3)
	    	{
	    		if(numberof1_c==0)
	    		{
	    			temp_point_c+=11;
	    		}
	    		else
	    		{
	    			temp_point_c+=1;
	    		}
	    		
	    		numberof1_c+=1;
	    	}
	    	else if(bb.get(card)>=4 && bb.get(card)<=7)
	    	{
	    		temp_point_c+=2;
	    	}
	    	else if(bb.get(card)>=8 && bb.get(card)<=11)
	    	{
	    		temp_point_c+=3;
	    	}
	    	else if(bb.get(card)>=12 && bb.get(card)<=15)
	    	{
	    		temp_point_c+=4;
	    	}
	    	else if(bb.get(card)>=16 && bb.get(card)<=19)
	    	{
	    		temp_point_c+=5;
	    	}
	    	else if(bb.get(card)>=20 && bb.get(card)<=23)
	    	{
	    		temp_point_c+=6;
	    	}
	    	else if(bb.get(card)>=24 && bb.get(card)<=27)
	    	{
	    		temp_point_c+=7;
	    	}
	    	else if(bb.get(card)>=28 && bb.get(card)<=31)
	    	{
	    		temp_point_c+=8;
	    	}
	    	else if(bb.get(card)>=32 && bb.get(card)<=35)
	    	{
	    		temp_point_c+=9;
	    	}
	    	else 
	    	{
	    		temp_point_c+=10;
	    	}
	    	
	    	
	    	bb.remove(card);
	    	aa.remove(card);
	    	total-=1;
	    	cx+=125;
	    	move_cx-=2.5;
	    	poker_back.setLayoutX(350);
			poker_back.setLayoutY(180);
			time_c+=1;
			if(temp_point_c>21 && numberof1_c>0)
	    	{
	    		temp_point_c-=10;
	    		numberof1_c-=100;
	    	}
	    }
	    
	    void temp_deck() {
	    	cc.add(poker_club_1);
	    	cc.add(poker_daimond_1);
	    	cc.add(poker_heart_1);
	        cc.add(poker_spades_1);
	        cc.add(poker_club_2);
	    	cc.add(poker_daimond_2);
	    	cc.add(poker_heart_2);
	    	cc.add(poker_spades_2);
	    	cc.add(poker_club_3);
	    	cc.add(poker_daimond_3);
	    	cc.add(poker_heart_3);
	        cc.add(poker_spades_3);
	    	cc.add(poker_club_4);
	    	cc.add(poker_daimond_4);
	    	cc.add(poker_heart_4);
	    	cc.add(poker_spades_4);
	    	cc.add(poker_club_5);
	    	cc.add(poker_daimond_5);
	    	cc.add(poker_heart_5);
	    	cc.add(poker_spades_5);
	    	cc.add(poker_club_6);
	    	cc.add(poker_daimond_6);
	    	cc.add(poker_heart_6);
	    	cc.add(poker_spades_6);
	    	cc.add(poker_club_7);
	    	cc.add(poker_daimond_7);
	    	cc.add(poker_heart_7);
	    	cc.add(poker_spades_7);
	    	cc.add(poker_club_8);
	    	cc.add(poker_daimond_8);
	    	cc.add(poker_heart_8);
	    	cc.add(poker_spades_8);
	    	cc.add(poker_club_9);
	    	cc.add(poker_daimond_9);
	        cc.add(poker_heart_9);
	        cc.add(poker_spades_9);
	    	cc.add(poker_club_10);
	    	cc.add(poker_daimond_10);
	    	cc.add(poker_heart_10);
	    	cc.add(poker_spades_10);
	    	cc.add(poker_club_11);
	    	cc.add(poker_daimond_11);
	    	cc.add(poker_heart_11);
	    	cc.add(poker_spades_11);
	    	cc.add(poker_club_12);
	    	cc.add(poker_daimond_12);
	    	cc.add(poker_heart_12);
	    	cc.add(poker_spades_12);
	    	cc.add(poker_club_13);
	    	cc.add(poker_daimond_13);
	    	cc.add(poker_heart_13);
	        cc.add(poker_spades_13);
	    }
	    void reset_deck() {
	    	for(int zz=0; zz<52;zz++)
	    	{
	    		cc.get(zz).setLayoutX(350);
	    		cc.get(zz).setLayoutY(180);
	    	}
	    }
	    
	    //slot rule

	    @FXML
	    private Pane slot_rule;
	    @FXML
	    private Button backslot;

	    @FXML
	    private Button back7;

	    @FXML
	    void backslot() {
	    	slot_machine.setVisible(true);
			slot_rule.setVisible(false);
			back8.setVisible(false);
	    }

	    @FXML
	    void gobacktomenu_slot_rule() {
	    	slot_rule.setVisible(false);
	    	menu.setVisible(true);
	    	main_test2.cash1 = Integer.toString(main_test2.cash_value);
			money.setText(main_test2.cash1);
	    }

	    
	    
	    //slot
	    
	    @FXML
	    private Pane slot_machine;
	    
	    @FXML
	    private ImageView a;

	    @FXML
	    private ImageView b;

	    @FXML
	    private ImageView c;

	    @FXML
	    private ImageView d;

	    @FXML
	    private ImageView e;

	    @FXML
	    private Button start2;

	    @FXML
	    private Label slotcoin;

	    @FXML
	    private Label winscene;

	    @FXML
	    private Label fail;

	    @FXML
	    private ImageView a1;

	    @FXML
	    private ImageView b1;

	    @FXML
	    private ImageView c1;

	    @FXML
	    private ImageView d1;

	    @FXML
	    private ImageView e1;

	    @FXML
	    private Button back8;

	    @FXML
	    void gobacktomenu_slot() {
	    	if(main_test2.cash_value == 0)
			{
				throwcoin.setDisable(true);
				throwdice.setDisable(true);
				point_21.setDisable(true);
				slot.setDisable(true);
				shop.setDisable(true);
				horse_race_button.setDisable(true);
			}
	    	slot_machine.setVisible(false);
	    	menu.setVisible(true);
	    	main_test2.cash1 = Integer.toString(main_test2.cash_value);
			money.setText(main_test2.cash1);
			start2.setDisable(false);
			a.setVisible(false);
	    	b.setVisible(false);
	    	c.setVisible(false);
	    	d.setVisible(false);
	    	e.setVisible(false);
	    	winscene.setVisible(false);
	    }
	    
	    @FXML
	    InputStream inStream1 = getClass().getResourceAsStream("7 picture.jpg");
		Image seven=new Image(inStream1);

	    InputStream inStream2 = getClass().getResourceAsStream("bell picture.jpg");
		Image bell=new Image(inStream2);

	    InputStream inStream3 = getClass().getResourceAsStream("c++ picture.jpg");
		Image cp=new Image(inStream3);

	    InputStream inStream4 = getClass().getResourceAsStream("cherry picture.jpg");
		Image cherry=new Image(inStream4);

	    InputStream inStream5 = getClass().getResourceAsStream("java picture.jpg");
		Image ja=new Image(inStream5);

	    InputStream inStream6 = getClass().getResourceAsStream("Python picture.jpg");
		Image py=new Image(inStream6);

	    InputStream inStream7 = getClass().getResourceAsStream("star picture.jpg");
	    Image star=new Image(inStream7);
	    

	    @FXML
	    public void play() {
	    	start2.setDisable(true);
	    	final Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setTitle("小提示");
	    	alert.setHeaderText("當前金額及下注金額確認");
	    	alert.setContentText("您目前的金額是: "+(main_test2.cash_value-200)+"   "+"您這次的賭金是: 200");
	    	alert.showAndWait();
	    	
	    	if(main_test2.cash_value<200) {fail.setVisible(true);}	    	
	    	else {
	    		winscene.setText(null);
	    		a.setVisible(false);
		    	b.setVisible(false);
		    	c.setVisible(false);
		    	d.setVisible(false);
		    	e.setVisible(false);
		    	int check=0;
		    		for(int i=0;i<6;i++) {
		    			Timeline roll=new Timeline(new KeyFrame(Duration.millis(50),
		    					(d) -> 	{	a1.setVisible(true);
		    			    				b1.setVisible(true);
		    			    				c1.setVisible(true);
		    			    				d1.setVisible(true);
		    			    				e1.setVisible(true);
		    								if(a1.getLayoutY()<211) {
				    						 a1.setLayoutY(260);
				    		    			 b1.setLayoutY(260);
				    		    			 c1.setLayoutY(260);
				    		    			 d1.setLayoutY(260);
				    		    			 e1.setLayoutY(260);
		    							 }
		    							 a1.setLayoutY(a1.getLayoutY()-2);
		    							 b1.setLayoutY(b1.getLayoutY()-2);
		    							 c1.setLayoutY(c1.getLayoutY()-2);
		    							 d1.setLayoutY(d1.getLayoutY()-2);
		    							 e1.setLayoutY(e1.getLayoutY()-2);
		    							 if(a1.getLayoutY()==210) {
		    								 	a1.setVisible(false);
		    				    		    	b1.setVisible(false);
		    				    		    	c1.setVisible(false);
		    				    		    	d1.setVisible(false);
		    				    		    	e1.setVisible(false);
		    							 }
		    					
		    							}
		    					));
		    			roll.setCycleCount(25);
		    			roll.play();
		    			if(i==5) {
		    				a.setVisible(true);
		    		    	b.setVisible(true);
		    		    	c.setVisible(true);
		    		    	d.setVisible(true);
		    		    	e.setVisible(true);
		    			}
		    			
		    		}
		    main_test2.cash_value-=200;
	    	String ncoin=String.valueOf(main_test2.cash_value);
	    	money.setText(ncoin);
	    	Random r=new Random();
	    	int scount=0,cherrycount=0,pycount=0,jacount=0,cpcount=0,starcount=0,bellcount=0;
	    	int ra=r.nextInt(7),rb=r.nextInt(7),rc=r.nextInt(7),rd=r.nextInt(7),re=r.nextInt(7);
	    	
	    	if(ra==0) {a.setImage(bell);}
	    	else if(ra==1) {a.setImage(cherry);}
	    	else if(ra==2) {a.setImage(cp);}
	    	else if(ra==3) {a.setImage(ja);}
	    	else if(ra==4) {a.setImage(py);}
	    	else if(ra==5) {a.setImage(star);}
	    	else if(ra==6) {a.setImage(seven);}
	    	if(rb==0) {b.setImage(bell);}
	    	else if(rb==1) {b.setImage(cherry);}
	    	else if(rb==2) {b.setImage(cp);}
	    	else if(rb==3) {b.setImage(ja);}
	    	else if(rb==4) {b.setImage(py);}
	    	else if(rb==5) {b.setImage(star);}
	    	else if(rb==6) {b.setImage(seven);}
	    	if(rc==0) {c.setImage(bell);}
	    	else if(rc==1) {c.setImage(cherry);}
	    	else if(rc==2) {c.setImage(cp);}
	    	else if(rc==3) {c.setImage(ja);}
	    	else if(rc==4) {c.setImage(py);}
	    	else if(rc==5) {c.setImage(star);}
	    	else if(rc==6) {c.setImage(seven);}
	    	if(rd==0) {d.setImage(bell);}
	    	else if(rd==1) {d.setImage(cherry);}
	    	else if(rd==2) {d.setImage(cp);}
	    	else if(rd==3) {d.setImage(ja);}
	    	else if(rd==4) {d.setImage(py);}
	    	else if(rd==5) {d.setImage(star);}
	    	else if(rd==6) {d.setImage(seven);}
	    	if(re==0) {e.setImage(bell);}
	    	else if(re==1) {e.setImage(cherry);}
	    	else if(re==2) {e.setImage(cp);}
	    	else if(re==3) {e.setImage(ja);}
	    	else if(re==4) {e.setImage(py);}
	    	else if(re==5) {e.setImage(star);}
	    	else if(re==6) {e.setImage(seven);}
	    	ArrayList<Integer> count=new ArrayList<Integer>();
	    	count.add(ra);count.add(rb);count.add(rc);count.add(rd);count.add(re);
	    	for(int i=0;i<5;i++) {
	    		if(count.get(i)==0) {bellcount+=1;}
	    		else if(count.get(i)==1) {cherrycount+=1;}
	    		else if(count.get(i)==2) {cpcount+=1;}
	    		else if(count.get(i)==3) {jacount+=1;}
	    		else if(count.get(i)==4) {pycount+=1;}
	    		else if(count.get(i)==5) {starcount+=1;}
	    		else if(count.get(i)==6) {scount+=1;}
	    	}
	    	if(scount==5) {main_test2.cash_value+=50000;winscene.setText("+50000");winscene.setVisible(true);}
	    	else if(pycount==5 || cpcount==5 || jacount==5) {main_test2.cash_value+=35000;winscene.setText("+35000");winscene.setVisible(true);}
	    	else if(starcount==5) {main_test2.cash_value+=25000;winscene.setText("+25000");winscene.setVisible(true);}
	    	else if(cherrycount==5 || bellcount==5) {main_test2.cash_value+=20000;winscene.setText("+20000");winscene.setVisible(true);}
	    	else if(scount==4) {main_test2.cash_value+=17000;winscene.setText("+17000");winscene.setVisible(true);}
	    	else if(pycount==4 || cpcount==4 || jacount==4) {main_test2.cash_value+=14000;winscene.setText("+14000");winscene.setVisible(true);}
	    	else if(starcount==4) {main_test2.cash_value+=12000;winscene.setText("+12000");winscene.setVisible(true);}
	    	else if(cherrycount==4 || bellcount==4) {main_test2.cash_value+=10000;winscene.setText("+10000");winscene.setVisible(true);}
	    	else if(scount==3) {main_test2.cash_value+=7000;winscene.setText("+7000");}
	    	else if(pycount==3 || cpcount==3 || jacount==3) {main_test2.cash_value+=5000;winscene.setText("+5000");winscene.setVisible(true);}
	    	else if(starcount==3) {main_test2.cash_value+=3000;winscene.setText("+3000");winscene.setVisible(true);}
	    	else if(cherrycount==3 || bellcount==3) {main_test2.cash_value+=2000;winscene.setText("+2000");winscene.setVisible(true);}
	    	String ncoin2=String.valueOf(main_test2.cash_value);
	    	money.setText(ncoin2);
	    	}
	    	back8.setVisible(true);
	    }
	    
	    
	    //horse race rule
	    @FXML
	    private Pane horse_race_rule;

	    @FXML
	    private Button next_horse_race_rule;

	    @FXML
	    private Button back11;
	    
	    @FXML
	    void gobacktomenu_horse_rule() {
	    	horse_race_rule.setVisible(false);
	    	menu.setVisible(true);
	    	main_test2.cash1 = Integer.toString(main_test2.cash_value);
			money.setText(main_test2.cash1);
	    }
	    
	    @FXML
	    void next_horse_race_rule() {
	    	horse_race.setVisible(true);
			horse_race_rule.setVisible(false);
			back11.setVisible(false);
	    }


	    //horse race
	    @FXML
	    private Pane end;

	    @FXML
	    private ImageView h1;

	    @FXML
	    private ImageView h2;
	    
	    @FXML
	    private ImageView h3;

	    @FXML
	    private ImageView h4;

	    @FXML
	    private ImageView h5;

	    @FXML
	    private Label wincoin;

	    @FXML
	    private RadioButton s1;

	    @FXML
	    private RadioButton s2;

	    @FXML
	    private RadioButton s3;

	    @FXML
	    private RadioButton s4;

	    @FXML
	    private RadioButton s5;

	    @FXML
	    private Button call;
	    
	    @FXML
	    private Button back10;

	    @FXML
	    private Label result1;
	    
	    @FXML
	    private Pane horse_race;
	    
	    
	    int check=0;
	    int check2=0;

	    @FXML
	    void gobacktomenu_horse_race() {
	    	if(main_test2.cash_value == 0)
			{
				throwcoin.setDisable(true);
				throwdice.setDisable(true);
				point_21.setDisable(true);
				slot.setDisable(true);
				shop.setDisable(true);
				horse_race_button.setDisable(true);
				horse_race_button.setDisable(true);
			}
	    	horse_race.setVisible(false);
	    	menu.setVisible(true);
	    	main_test2.cash1 = Integer.toString(main_test2.cash_value);
			money.setText(main_test2.cash1);
	    	check=0;
	    	check2=0;
	    	h1.setLayoutX(57);
	    	h2.setLayoutX(57);
	    	h3.setLayoutX(57);
	    	h4.setLayoutX(57);
	    	h5.setLayoutX(57);
	    	call.setDisable(false);
	    	s1.setDisable(false);
	    	s2.setDisable(false);
	    	s3.setDisable(false);
	    	s4.setDisable(false);
	    	s5.setDisable(false);
	    	s1.setSelected(false);
	    	s2.setSelected(false);
	    	s3.setSelected(false);
	    	s4.setSelected(false);
	    	s5.setSelected(false);
	    	wincoin.setVisible(false);
	    	result1.setVisible(false);
	    }
	    
	    @FXML
	    void callcoin() {
	    	String a=Integer.toString(bet_money);
	    	call.setDisable(true);
	    	back10.setVisible(true);
	    	s1.setDisable(true);
	    	s2.setDisable(true);
	    	s3.setDisable(true);
	    	s4.setDisable(true);
	    	s5.setDisable(true);
	    	
	    	final Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setTitle("小提示");
	    	alert.setHeaderText("當前金額及下注金額確認");
	    	alert.setContentText("您目前的金額是: "+(main_test2.cash_value-bet_money)+"   "+"您這次的賭金是: "+bet_money);
	    	alert.showAndWait();
	    	
	    	ThreadLocalRandom tlr = ThreadLocalRandom.current();
	    	ThreadLocalRandom tlr2 = ThreadLocalRandom.current();
	    	ThreadLocalRandom tlr3 = ThreadLocalRandom.current();
	    	ThreadLocalRandom tlr4 = ThreadLocalRandom.current();
	    	ThreadLocalRandom tlr5 = ThreadLocalRandom.current();
	    	int cm=Integer.valueOf(a);
	    	if(s1.isSelected()) {
	    		check=1;
	    		}
	    	
	    	else if(s2.isSelected()) {
	    		check=2;
	    	}
	    	else if(s3.isSelected()) {
	    		check=3;
	    	}
	    	else if(s4.isSelected()) {
	    		check=4;
	    	}
	    	else if(s5.isSelected()) {
	    		check=5;
	    	}
	    	double endx=end.getLayoutX()-50;
	    	
	    	 Timeline race=new Timeline(new KeyFrame(Duration.millis(250),
					(d) -> 	{
						double hx1= h1.getLayoutX();
						double hx2=h2.getLayoutX();
						double hx3=h3.getLayoutX();
						double hx4=h4.getLayoutX();
						double hx5=h5.getLayoutX();	
					if(endx>hx1 && endx>hx2 && endx>hx3 && endx>hx4 && endx>hx5) {
							double d1=tlr.nextDouble(15,100);
							double d2=tlr2.nextDouble(15,97);
							double d3=tlr3.nextDouble(15,95);
							double d4=tlr4.nextDouble(15,91);
							double d5=tlr5.nextDouble(15,85);
							h1.setLayoutX(h1.getLayoutX()+d1);
							h2.setLayoutX(h2.getLayoutX()+d2);
							h3.setLayoutX(h3.getLayoutX()+d3);
							h4.setLayoutX(h4.getLayoutX()+d4);
							h5.setLayoutX(h5.getLayoutX()+d5);
					}
					else if(endx<=hx1 && check==1 && check2==0) {
								main_test2.cash_value+=cm;
								result1.setText("You Win");
								wincoin.setText(a);
								result1.setVisible(true);
								wincoin.setVisible(true);
								check2=1;
								
							} 
					else if(endx<=hx2 && check==2 && check2==0) {
								main_test2.cash_value+=cm*2;
								result1.setText("You Win");
								wincoin.setText(Integer.toString(cm*2));
								result1.setVisible(true);
								wincoin.setVisible(true);
								check2=1;
								
							}
					else if(endx<=hx3 && check==3 && check2==0) {
						main_test2.cash_value+=cm*3;
						result1.setText("You Win");
						wincoin.setText(Integer.toString(cm*3));
						result1.setVisible(true);
						wincoin.setVisible(true);
						check2=1;
						
					}
					else if(endx<=hx4 && check==4 && check2==0) {
						main_test2.cash_value+=cm*4;
						result1.setText("You Win");
						wincoin.setText(Integer.toString(cm*4));
						result1.setVisible(true);
						wincoin.setVisible(true);
						check2=1;
						
					}
					else if(endx<=hx5 && check==5 && check2==0) {
						main_test2.cash_value+=cm*5;
						result1.setText("You Win");
						wincoin.setText(Integer.toString(cm*5));
						result1.setVisible(true);
						wincoin.setVisible(true);
						check2=1;
						
					}
					else if(check2==0 ){
						main_test2.cash_value-=cm;
						result1.setText("You Lose");
						wincoin.setText(a);
						result1.setVisible(true);
						wincoin.setVisible(true);
						check2=1;
						
					}
				}
			));
	    	race.setCycleCount(10);
	    	race.play();
	    	
			
			
	    }
	    	
	    
}