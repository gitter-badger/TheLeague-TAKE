package pl.polsl.take.projekt;

import java.io.InputStream;

import javax.ejb.Local;

@Local
public interface League {

	public abstract String create(InputStream is);

	public abstract String find(int id);

	public abstract String get();

	public abstract String update(InputStream is);

	public abstract void delete(int id);

}