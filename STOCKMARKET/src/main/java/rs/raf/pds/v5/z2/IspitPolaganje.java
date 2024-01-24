package rs.raf.pds.v5.z2;

import rs.raf.pds.v5.z2.gRPC.Predmet;

import java.util.ArrayList;
import java.util.List;

import rs.raf.pds.v5.z2.gRPC.Ispit;
import rs.raf.pds.v5.z2.gRPC.IspitIzvestaj;
import rs.raf.pds.v5.z2.gRPC.Ocena;

public class IspitPolaganje {
	final Ispit ispit;
	final Predmet p;
	final int ispitniRokMesec;
	final int ispitniRokGodina;
	
	List<Ocena> ocene = new ArrayList<Ocena>();
	
	public IspitPolaganje(Ispit i, Predmet p) {
		this.ispit = i;
		this.p = p;
		this.ispitniRokMesec = StudentServiceUtil.getMesec(i.getSifra());
		this.ispitniRokGodina = StudentServiceUtil.getGodina(i.getSifra());
	}
	
	public void addOcena(Ocena novaOcena) {
		int foundOcena = -1;
		
		for (int i=0;i<ocene.size(); i++) {
			if (ocene.get(i).getSifStud().equals(novaOcena.getSifStud())){
				foundOcena = i;
				break;
			}
		}
		if (foundOcena >=0) {
			ocene.remove(foundOcena);
		}
		
		ocene.add(novaOcena);
	}
	public double prosecnaOcena() {
		int zbirOcena = 0;
		for (int i=0;i<ocene.size();i++)
			zbirOcena += ocene.get(i).getOcena();
		return (double)zbirOcena/(double)ocene.size();
	}
	
	public IspitIzvestaj getIspitIzvestaj() {
		var izvestaj = IspitIzvestaj.newBuilder()
				.setSifIsp(ispit.getSifra())
				.setNazivP(p.getNaziv())
				.setPolozilo(ocene.size())
				.setRokMesec(ispitniRokMesec)
				.setRokGodina(ispitniRokGodina)
				.setProsOcena(prosecnaOcena());
		
		return izvestaj.build();
	}

	protected List<Ocena> getOcene() {
		return ocene;
	}
					
}
