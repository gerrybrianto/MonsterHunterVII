package personnage;

public class Monstre extends PNJ{
	
	public static final int CATEGORIE_1 = 1;
	public static final int CATEGORIE_2 = 2;
	public static final int CATEGORIE_3 = 3;
	public static final int CATEGORIE_4 = 4;
	public static final int CATEGORIE_5 = 5;
	public static final int CATEGORIE_6 = 6;
	public static final int CATEGORIE_7 = 7;
	public static final int CATEGORIE_8 = 8;
	public static final int CATEGORIE_9 = 9;
	public static final int CATEGORIE_10 = 10;
	
	public static final Niveaux NIVEAUX_CATEGORIE_1 = new Niveaux(6);
	public static final Niveaux NIVEAUX_CATEGORIE_2 = new Niveaux(12);
	public static final Niveaux NIVEAUX_CATEGORIE_3 = new Niveaux(18);
	public static final Niveaux NIVEAUX_CATEGORIE_4 = new Niveaux(24);
	public static final Niveaux NIVEAUX_CATEGORIE_5 = new Niveaux(30);
	public static final Niveaux NIVEAUX_CATEGORIE_6 = new Niveaux(36);
	public static final Niveaux NIVEAUX_CATEGORIE_7 = new Niveaux(42);
	public static final Niveaux NIVEAUX_CATEGORIE_8 = new Niveaux(48);
	public static final Niveaux NIVEAUX_CATEGORIE_9 = new Niveaux(54);
	public static final Niveaux NIVEAUX_CATEGORIE_10 = new Niveaux(60);
	
	public Monstre() {
		super();

	}
	
	public Monstre (String nom, int PV, int PX, Niveaux initiative, Niveaux attaque, Niveaux esquive, Niveaux defense, Niveaux degats){
		super(nom, PV, PX, initiative, attaque, esquive, defense, degats);
	}

	public Monstre(String nom, int categorie) {
		this.PV = 100;
		switch (categorie){
		case 1 :
			this.PX = 100;
			this.initiative = NIVEAUX_CATEGORIE_1;
			this.attaque = NIVEAUX_CATEGORIE_1;
			this.esquive = NIVEAUX_CATEGORIE_1;
			this.defense = NIVEAUX_CATEGORIE_1;
			this.degats = NIVEAUX_CATEGORIE_1;break;
		case 2 :
			this.PX = 200;
			this.initiative = NIVEAUX_CATEGORIE_2;
			this.attaque = NIVEAUX_CATEGORIE_2;
			this.esquive = NIVEAUX_CATEGORIE_2;
			this.defense = NIVEAUX_CATEGORIE_2;
			this.degats = NIVEAUX_CATEGORIE_2;break;
		case 3 :
			this.PX = 300;
			this.initiative = NIVEAUX_CATEGORIE_3;
			this.attaque = NIVEAUX_CATEGORIE_3;
			this.esquive = NIVEAUX_CATEGORIE_3;
			this.defense = NIVEAUX_CATEGORIE_3;
			this.degats = NIVEAUX_CATEGORIE_3;break;
		case 4 :
			this.PX = 400;
			this.initiative = NIVEAUX_CATEGORIE_4;
			this.attaque = NIVEAUX_CATEGORIE_4;
			this.esquive = NIVEAUX_CATEGORIE_4;
			this.defense = NIVEAUX_CATEGORIE_4;
			this.degats = NIVEAUX_CATEGORIE_4;break;
		case 5 :
			this.PX = 500;
			this.initiative = NIVEAUX_CATEGORIE_5;
			this.attaque = NIVEAUX_CATEGORIE_5;
			this.esquive = NIVEAUX_CATEGORIE_5;
			this.defense = NIVEAUX_CATEGORIE_5;
			this.degats = NIVEAUX_CATEGORIE_5;break;
		case 6 :
			this.PX = 600;
			this.initiative = NIVEAUX_CATEGORIE_6;
			this.attaque = NIVEAUX_CATEGORIE_6;
			this.esquive = NIVEAUX_CATEGORIE_6;
			this.defense = NIVEAUX_CATEGORIE_6;
			this.degats = NIVEAUX_CATEGORIE_6;break;
		case 7 :
			this.PX = 700;
			this.initiative = NIVEAUX_CATEGORIE_7;
			this.attaque = NIVEAUX_CATEGORIE_7;
			this.esquive = NIVEAUX_CATEGORIE_7;
			this.defense = NIVEAUX_CATEGORIE_7;
			this.degats = NIVEAUX_CATEGORIE_7;break;
		case 8 :
			this.PX = 800;
			this.initiative = NIVEAUX_CATEGORIE_8;
			this.attaque = NIVEAUX_CATEGORIE_8;
			this.esquive = NIVEAUX_CATEGORIE_8;
			this.defense = NIVEAUX_CATEGORIE_8;
			this.degats = NIVEAUX_CATEGORIE_8;break;
		case 9 :
			this.PX = 900;
			this.initiative = NIVEAUX_CATEGORIE_9;
			this.attaque = NIVEAUX_CATEGORIE_9;
			this.esquive = NIVEAUX_CATEGORIE_9;
			this.defense = NIVEAUX_CATEGORIE_9;
			this.degats = NIVEAUX_CATEGORIE_9;break;
		case 10 :
			this.PX = 1000;
			this.initiative = NIVEAUX_CATEGORIE_10;
			this.attaque = NIVEAUX_CATEGORIE_10;
			this.esquive = NIVEAUX_CATEGORIE_10;
			this.defense = NIVEAUX_CATEGORIE_10;
			this.degats = NIVEAUX_CATEGORIE_10;break;
		default :
			this.PX = 0;
			this.initiative = null;
			this.attaque = null;
			this.esquive = null;
			this.defense = null;
			this.degats = null;			
		}
	}
	
}