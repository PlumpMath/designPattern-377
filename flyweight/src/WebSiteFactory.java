import java.util.HashMap;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/2 22:10
 * 网站工厂类
 */
public class WebSiteFactory {

	private HashMap<String, WebSite> flyweights = new HashMap<String, WebSite>();

	/**
	 * 获得网站分类
	 * @param key
	 * @return
	 */
	public WebSite getWebSiteCategory(String key) {

		if(!flyweights.containsKey(key))
			flyweights.put(key, new ConcreteWebSite(key));

		return flyweights.get(key);

		// 以下代码也可实现，且只需get一次
		/*
		WebSite site = flyweights.get(key);
		if(null == site) {
			site = new ConcreteWebSite(key);
			flyweights.put(key, site);
		}
		return site;
		*/
	}

	/**
	 * 获得网站分类总数
	 * @return
	 */
	public int getWebSiteCount() {
		return flyweights.size();
	}
}
