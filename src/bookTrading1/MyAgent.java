package bookTrading1;

import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;
import jade.core.behaviours.WakerBehaviour;

public class  MyAgent extends Agent { 
	   
		   protected void setup() { 
		   addBehaviour(new TickerBehaviour(this,  10000) { 
		   protected void onTick() { 
		   // perform operation Y 
		   } 
		   } ); 
		   } 
		   }
	 
	   