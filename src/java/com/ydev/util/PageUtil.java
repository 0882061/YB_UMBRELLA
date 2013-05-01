package com.ydev.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PageUtil {
	
	private static final Log logger = LogFactory.getLog(PageUtil.class);

	public static Page doPage(Integer recordTotal, String curPage, String dispPg, String dispRs, String endPg, String startPg) {
		Page page = new Page();
		try {
			page.setCurrentPage(Integer.parseInt(curPage));
			page.setDisplayPage(Integer.parseInt(dispPg));
			page.setDisplayRecord(Integer.parseInt(dispRs));
			if(Page.PAGE_START==page.getCurrentPage()){
				page.setStart(Page.PAGE_START);
				page.setEndPage(page.getDisplayPage());
			}else{
				page.setEndPage(Integer.parseInt(endPg));
				page.setStartPage(Integer.parseInt(startPg));
			}
			
			page.setRecordTotal(recordTotal);
			int yushu = page.getRecordTotal()%page.getDisplayRecord();
			
			int a = page.getRecordTotal();
			int b = page.getDisplayRecord();
//			int pageTotal = page.getRecordTotal()/page.getDisplayRecord();
			int pageTotal = a/b;
			if(yushu>0)
				pageTotal += yushu;
			page.setPageTotal(pageTotal);
			
			int currentPage = page.getCurrentPage();
			int chushu = (page.getDisplayPage()-1);
			int tempYu = currentPage%chushu;
			int tempCh = currentPage/chushu;
			
			int totalYu = page.getPageTotal()%chushu;
			int totalCh = page.getPageTotal()/chushu;
			
			int endYu = 1;
			int endCh;
			if(totalYu==0){
				endCh = totalCh-1;
			}else{
				endCh = totalCh;
			}
			
			page.setLastStartPage(endCh*chushu+endYu);
			
			if(tempYu==1){
				if(page.getCurrentPage()==page.getEndPage()){
					//往后显示
					if(tempYu==endYu&&tempCh==endCh){
						page.setStartPage(page.getEndPage());
						page.setEndPage(page.getPageTotal());
					}else{
						page.setStartPage(page.getEndPage());
						page.setEndPage((tempCh+1)*chushu+1);
					}
				}else{
					//往前显示
					if(tempCh!=0){
						page.setEndPage(page.getCurrentPage());
						page.setStartPage((tempCh-1)*chushu+1);
					}else{
						if(endYu==tempYu && endCh==tempCh){
							page.setEndPage(page.getPageTotal());
						}else{
							page.setEndPage(page.getDisplayPage());
						}
						page.setStartPage(Page.PAGE_START);
					}
				}
			}
			
			Integer start = (page.getCurrentPage()-1)*page.getDisplayRecord();
			page.setStart(start);
			List<Integer> temps = new ArrayList<Integer>();
			
			for(int i=page.getStartPage();i<=page.getEndPage();i++){
				temps.add(i);
			}
			page.setDis(temps);
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return page;
	}

}
