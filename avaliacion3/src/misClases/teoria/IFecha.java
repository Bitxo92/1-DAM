package misClases.teoria;

import java.util.Calendar;

public interface IFecha {
	public final static int DIA_DEL_MES= Calendar.DAY_OF_MONTH;
	public final static int MES_DEL_ANO=Calendar.MONTH;
	public final static int ANO=Calendar.YEAR;
	
	public abstract int dia();
	public abstract int mes();
	public abstract int ano();

}
