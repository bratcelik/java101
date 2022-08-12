package AdventureGame;

public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Tool Store", "Equipment");
    }

    @Override
    public boolean onLocation() {
        System.out.println("\n\t====== Welcome to the Tool Store ======\n");
        topMenu();
        return true;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "You can buy weapons and armor.";
    }

    public void topMenu(){
        this.getPlayer().playerStats();
        int select;
        do {
            System.out.println("\n====== CATEGORIES ======");
            System.out.println("1 - Weapons\n2 - Armors\n3 - Exit");
            System.out.print("Please select a category : ");
            select = Location.input.nextInt();

            if (select < 1 || select > 3){
                System.out.println("Invalid Value! Try again.");
            }
            else {
                break;
            }
        }while (true);

        switch (select) {
            case 1 -> weaponMenu();
            case 2 -> armorMenu();
            case 3 -> System.out.println("Good Luck!");
        }

    }

    public void weaponMenu(){
        Weapon[] weaponList = Weapon.weapons();

        System.out.println("====== WEAPONS ======");
        do {
            System.out.println("ID\tWeapon Name\tDamage\tPrice");
            System.out.println("--\t-----------\t------\t-----");
            for (Weapon weapon : weaponList) {
                System.out.printf("%-1d\t%-11s\t%-6d\t%-5d\n",
                        weapon.getID(),
                        weapon.getName(),
                        weapon.getDamage(),
                        weapon.getPrice());
            }
            System.out.print("\nPlease select a Weapon ID ('-1' for Exit): ");
            int select = input.nextInt();

            if (select > 0 && select <= weaponList.length){
                buy(weaponList[select-1]);
                break;
            }
            else {
                System.out.println("Invalid Value! Try again.");
            }
        }while (true);

        topMenu();
    }

    public void armorMenu(){
        Armor[] armorList = Armor.armors();
        do {
            System.out.println("ID\t Armor Name \tDamage\tPrice");
            System.out.println("--\t------------\t------\t-----");
            for (Armor armor : armorList) {
                System.out.printf("%-1d\t%-12s\t%-6d\t%-5d\n",
                        armor.getID(),
                        armor.getName(),
                        armor.getBlock(),
                        armor.getPrice());
            }
            System.out.print("\nPlease select a Armor ID ('-1' for Exit): ");
            int select = input.nextInt();

            if (select == -1){
                break;
            }

            if (select > 0 && select <= armorList.length){
                buy(armorList[select-1]);
                break;
            }
            else {
                System.out.println("Invalid Value! Try again.");
            }
        }while (true);

        topMenu();
    }

    public void buy(Tool tool){
        if (tool.getPrice() > this.getPlayer().getMoney()){
            System.out.println("You do not have enough money.");
        }
        else {
            System.out.println("You now have the " + tool.getName() + ".");
            this.getPlayer().setMoney(this.getPlayer().getMoney() - tool.getPrice());
            System.out.println("Your remaining money : "+this.getPlayer().getMoney());

            if(tool instanceof Weapon){
                this.getPlayer().getInventory().setWeapon((Weapon) tool);
            }
            else{
                this.getPlayer().getInventory().setArmor((Armor) tool);
            }

        }
    }
}
