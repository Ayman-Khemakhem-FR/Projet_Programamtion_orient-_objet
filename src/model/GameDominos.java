package model;

import java.util.ArrayList;
import java.util.Stack;

public class GameDominos extends Game{
    static final int min_range = 1;
	static final int max_range = 2;
    static final int num_tuile = 15;

    public GameDominos() {
		sac = new Stack<>();
		players = new ArrayList<>();
		players.add(new Player("Victor"));
		for (int i = 0; i < num_tuile; i++) {
			sac.push(Utils.randomTuile(min_range, max_range));
		}
		plateau = sac.empty() ? null : new Plateau(sac.pop());
	}

    public GameDominos(ArrayList<Player> players) {
		this();
		this.players = players;
	}
	
	@Override
	public Plateau getPlateau() {
		return super.getPlateau();
	}

	@Override
	public Stack<Tuile> getSac() {
		return super.getSac();
	}

	public static int getNumTuile() {
		return num_tuile;
	}

	@Override
	public ArrayList<Player> getPlayers() {
		// TODO Auto-generated method stub
		return super.getPlayers();
	}
}
