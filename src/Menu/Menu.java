package Menu;

public class Menu {

	public static void pintaMenu() {
		System.out.println("Bien venido a los agentes TIA que te gustaria hacer");
		System.out.println("");
		System.out.println("1 Ver todos los agentes con su informacio");
		System.out.println("2 Ver los agentes que ganen mas de lo que tu me digas");
		System.out.println("3 Dar de alta un piso.");
		System.out.println("4 Dar de alta una nueva arma");
		System.out.println("5 Dar de alta un nuevo agente");
		System.out.println("6 Encriptar todo");
		System.out.println("7 Dessencriptar todo");
		System.out.println("8 Salir");

	}

	public static int eleccionMenu(int opc) {

		
		do {
			switch (opc) {
			case 1:
				System.out.println("Accediento a los agentes");
				break;
			case 2:
				System.out.println("Accediendo al pagos de los agentes");

				break;
			case 3:
				System.out.println("Dando de alta un Piso");

				break;
			case 4:
				System.out.println("Dando de alta una Arma");
				break;
			case 5:
				System.out.println("Dando de alta un Agente");
				break;
			case 6:
				System.out.println("Encriptando la informacion");
				break;
			case 7:
				System.out.println("Dessencriptando la informacion");
				break;
			case 8:
				System.out.println("Saliendo");
				opc=0;
				break;
			default:
				break;
			}

		} while (opc == 8);

		return opc;
	}

}
