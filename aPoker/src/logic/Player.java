package logic;


public class Player
{
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	public int id;
	
	public String name;

	public int stake, stake_before;

	public HoleCards holecards;

	public Action last_action;
	public SchedAction next_action;

	public boolean sitout;

	// ===========================================================
	// Constructors
	// ===========================================================

	public Player (String name, int id)
	{
		holecards = new HoleCards();
		next_action = new SchedAction();

		this.name = name;
		this.id = id;
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	public int getId() {
		return id;
	}

	public void setId(int playerID) {
		this.id = playerID;
	}

	public int getStake() {
		return stake;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String playerName) {
		this.name = playerName;
	}

	public void setStake(int stake) {
		this.stake = stake;
	}


	public SchedAction getNexAction() {
		return next_action;
	}

	public void setNextAction(SchedAction nextAction) {
		next_action = nextAction;
	}

	public Action getLastAction() {
		return last_action;
	}

	public void setLastAction(Action lastAction) {
		last_action = lastAction;
	}

	public void resetLastAction(){
		last_action = Action.None;
	}

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================

	public enum Action
	{
		None,
		ResetAction,

		Fold,
		Check,
		Call,
		Bet,
		Raise,
		Allin,

		Show,
		Muck,

		Sitout,
		Back;
	}

	public class SchedAction{
		public boolean valid;
		public Action action;
		public int amount;
	}
}
