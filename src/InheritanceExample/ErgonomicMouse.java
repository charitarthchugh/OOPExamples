package InheritanceExample;

/* This class demonstrates that you can inherit an item that itself is inherited from another item
 *Here,a ergonomic mouse contains the properties of a wireless mouse, which already contains the properties of a regular mouse, while having some more specific properties
 *
 */
public class ErgonomicMouse extends WirelessMouse {
    //ErgonomicMouse specific properties are set in these variables
    private boolean isErgonomic;

    public ErgonomicMouse() {
        isErgonomic = true;
    }

    public boolean getIsErgonomic() {
        return isErgonomic;
    }


}
