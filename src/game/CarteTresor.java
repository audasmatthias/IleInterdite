package game;

import enumerations.*;

/**
 *
 * @author estevmat
 */
public class CarteTresor extends Carte {

    CarteTresor(Tresor tresor){
        super(tresor);
    }

    public Tresor getTresor(){
        return tresor;
    }

    @Override
    public String getName() {
        return tresor.name();
    }
}
