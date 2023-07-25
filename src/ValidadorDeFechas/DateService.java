package ValidadorDeFechas;

public class DateService {
	
	public boolean validarFecha(int dia, int mes, int anio) {
		boolean valido=false;
		if (anio%4==0) {
			if(mes>0 && mes<13) {
				if((mes==1|| mes==3 || mes == 5|| mes==7|| mes==8 || mes==10|| mes==12 )&&(dia>0&&dia<32)) {
					valido=true;
				}else if( (mes==2)&&(dia>0&&dia<30)) {
					valido=true;
				}else if ((dia>0&&dia<31)&&(mes==4 || mes == 6|| mes==9|| mes==11)) {
					valido=true;
				}
			}
		}else {
			if((mes==1|| mes==3 || mes == 5|| mes==7|| mes==8 || mes==10|| mes==12 )&&(dia>0&&dia<32)) {
				valido=true;
			}else if( (mes==2)&&(dia>0&&dia<29)) {
				valido=true;
			}else if ((dia>0&&dia<31)&&(mes==4 || mes == 6|| mes==9|| mes==11)) {
				valido=true;
			}
		}
		return valido;
	}

}
