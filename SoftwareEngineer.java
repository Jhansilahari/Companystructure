package miniProject2;
public class SoftwareEngineer extends TechnicalEmployee
{
	public boolean codeAccess;
	public SoftwareEngineer(String name)
	{
		super(name);
		setCodeAccess(true);
	}
	public boolean getCodeAccess() 
	{
        return codeAccess;
    }
    public void setCodeAccess(boolean access)
    {
        this.codeAccess = access;
    }
    public int getSucessfulCheckIns()
    {
    	return checkIns;
    }
    public boolean checkInCode()
    {
    	TechnicalLead manager=(TechnicalLead) this.getManager();
        if(manager.approveCheckIn(this))
        {
            this.checkIns++;
            return true;
        } 
        else 
        {
            codeAccess=false;
            return false;
        }
    }
}