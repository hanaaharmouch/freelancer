package metierp;

public interface IValiderPost {

	void ValiderPost(Integer id, Integer idp);
	void ToProjet(Integer idoffre, Integer idfree, Integer idpost, Integer idporteur);
	void ValiderDelete(Integer idoffre);
}
