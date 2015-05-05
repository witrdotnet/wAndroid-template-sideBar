package net.witr.wandroid;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by witrdotnet <witr.net@gmail.com> on 03/05/15.
 */
public class ModelProvider {

    public static String STORE_PROJECTS_ID = "store1";
    public static String STORE_ISSUES_ID = "store2";
    public static String STORE_MEMBERS_ID = "store3";

    private static ModelProvider instance;

    List<Store> stores = null;

    private ModelProvider(){}

    public static synchronized ModelProvider instance(){
        if(instance == null){
            instance = new ModelProvider();
        }
        return instance;
    }

    public List<Store> getStores(){
        if(stores == null) {
            initData();
        }
        return stores;
    }

    public void initData(){
        stores = new ArrayList<Store>();

        Store storeProjects = new Store(STORE_PROJECTS_ID, MainActivity.getContext().getString(R.string.store_projects));
        storeProjects.getModelElements().add(new ModelElement("1", "wMorph", "01-01-2012", "to morph : to change gradually and completely from one thing into another thing usually in a way that is surprising or that seems magical"));
        storeProjects.getModelElements().add(new ModelElement("2", "wGrid", "01-01-2013", "a grid is a network of lines that cross each other to form a series of squares or rectangles"));
        storeProjects.getModelElements().add(new ModelElement("3", "deeweny", "01-01-2014", "poem platform"));

        Store storeIssues = new Store(STORE_ISSUES_ID, MainActivity.getContext().getString(R.string.store_issues));
        storeIssues.getModelElements().add(new ModelElement("1", "evo 1245", "01-05-2015", "add new feature\n"));
        storeIssues.getModelElements().add(new ModelElement("2", "bug 1246", "02-05-2015", "minor bug"));
        storeIssues.getModelElements().add(new ModelElement("3", "bug 1247", "03-05-2015", "major bug"));

        Store storeMembers = new Store(STORE_MEMBERS_ID, MainActivity.getContext().getString(R.string.store_members));
        storeMembers.getModelElements().add(new ModelElement("1", "witrdotnet", "01-01-2012", "owner"));
        storeMembers.getModelElements().add(new ModelElement("2", "James Gosling", "02-05-2015", "developer"));
        storeMembers.getModelElements().add(new ModelElement("3", "Linus Torvalds", "03-05-2015", "reporter"));

        stores.add(storeProjects);
        stores.add(storeIssues);
        stores.add(storeMembers);
    }
}