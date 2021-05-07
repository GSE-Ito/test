//
//FileName : SAA540PrintBean.java
//Created  : Tatsuki Tomohisa (MELCO)
//Date     : 2005-09-01
//COPYRIGHT (C) 2005 MITSUBISHI ELECTRIC CORPORATION
//ALL RIGHTS RESERVED
//
package jp.co.kyuden.sizai.it.saa.saa510.logic.inputinfo;

import java.util.ArrayList;
import java.util.HashMap;

import jp.co.kyuden.sizai.it.saa.saa510.SAA510Define;
import jp.co.kyuden.sizai.it.saa.saa510.util.SAA510Util;
import jp.co.kyuden.sizai.it.sac.sac000.logic.PrintLogic;
import jp.co.melco.garnet.base.foundation.Logger;
import jp.co.melco.kyuden.sizai.it.common.framework.Datatable;
import jp.co.melco.kyuden.sizai.it.util.BeanBase;

/**
 * 見積依頼書出力保持情報Bean.<br>
 * 見積依頼書出力に対する入力情報Bean.<BR>
 * 工事・運送・委託見積依頼書出力に関する情報を保持する
 *
 * @author        Tatsuki Tomohisa (MELCO)
 * @version       1.00    2006-04-28 <br>
 *                2.00 Tatsuki Tomohisa (MELCO) 2006-09-10 業務APP構造改善<br>
 *                       ・[障害番号U-2057(業務APP構造改善-ファイルヘッダコメントの記載徹底)]対応<br>
 *                       ・[障害番号U-2056(業務APP構造改善-変更履歴の記載徹底)]対応<br>
 *                       ・[障害番号U-1987(業務APP構造改善-JavaDoc，JSDoc警告修正)]対応<br>
 *                2.01 Katou Ryo (MELCO) 2006-09-24 業務APP構造改善<br>
 *                       ・[障害番号U-2135(業務APP構造改善-JavaDoc，JSDoc最新化)]対応<br>
 *                3.00 Tatsuki Tomohisa (MELCO) 2007-06-17 仕様変更<br>
 *                       ・[障害番号U20070021]対応<br>
 *                3.01 Tatsuki Tomohisa (MELCO) 2007-07-01 仕様変更<br>
 *                       ・[障害番号U20070348]対応<br>
 *                3.02 Sakamoto Shigefumi (MELCO) 2008-01-17 障害改修<br>
 *                       ・[障害番号U-1966(建設リサイクル法対象工事の見積依頼書について)]対応<br>
 *                4.00 Hikaru Yamada (MELCO) 2008-07-27 障害改修<br>
 *                       ・[障害番号U20080311]対応<br>
 *                4.01 Matsuo Jouji (MELCO) 2009-03-20 仕様変更<br>
 *                       ・[障害番号U20080857(業務移管No14「業務持ち替えや組織改正への対応機能追加（注文書の改善）」)]対応<br>
 *                5.00 Miyamoto Koki (MELCO) 2009-11-29 仕様変更<br>
 *                       ・[障害番号U20090226]対応<br>
 *               10.00 Hikaru Yamada (QBS) 2014-05-25 仕様変更<br>
 *                       ・[障害番号U20140036]対応<br>
 *               10.01 Tomohisa Tatsuki (QBS) 2015-03-08 仕様変更<br>
 *                       ・[障害番号U20140294]対応<br>
 *               12.00 Tomohisa Tatsuki (QBS) 2017-11-26 仕様変更<br>
 *                       ・[障害番号U20170253]対応<br> 
 */
public class SAA540PrintBean extends BeanBase {

    /*
     * Loggerクラス
     */
    private static Logger logger = Logger.getLogger(SAA510Util.class);
    /** 改行コード */
    private final String CRLF_CODE = "\r\n";
    
    /** 依頼書ヘッダ **/
    private ArrayList iraisho = new ArrayList();

    /** 依頼書(工事) **/
    private ArrayList kojiIraisho = new ArrayList();
    
    /** 依頼書(運送) **/
    private ArrayList unsoIraisho = new ArrayList();
    
    /** 依頼書(委託) **/
    private ArrayList itakuIraisho = new ArrayList();

    /** 依頼書明細 **/
    private HashMap iraishoMeisai = new HashMap();

    /** 注意文書 **/
    private HashMap chuiBunsho = new HashMap();

    /** 備考 **/
    private HashMap hBiko = new HashMap();

    /** 業務区分 **/
    private String gyomuKubun = "";

    /** 説明会集合場所 **/
    private HashMap hSetsumeiKaiBasho = new HashMap();

   /** 運送区間（至） **/
    private HashMap hUnsoKukanTo = new HashMap();

    private final int ARRAY_INDEX_0 = 0;
    private final int ARRAY_INDEX_1 = 1;
    private final int ARRAY_INDEX_2 = 2;
    private final int ARRAY_INDEX_3 = 3;
    private final int ARRAY_INDEX_4 = 4;
    private final int ARRAY_INDEX_5 = 5;
    private final int ARRAY_INDEX_6 = 6;
    private final int ARRAY_INDEX_7 = 7;
    private final int ARRAY_INDEX_8 = 8;
    private final int ARRAY_INDEX_9 = 9;
    private final int ARRAY_INDEX_10 = 10;
    private final int ARRAY_INDEX_11 = 11;
    private final int ARRAY_INDEX_12 = 12;
    private final int ARRAY_INDEX_13 = 13;
    private final int ARRAY_INDEX_14 = 14;
    private final int ARRAY_INDEX_15 = 15;
  
    /**
     * @param list ArrayList依頼書ヘッダ・明細部 
     */
    public void setIraisho(ArrayList list) {
        iraisho = list;
    }

    /**
     * @return ArrayList[] 依頼書ヘッダ・明細部 
     */
    public ArrayList getIraisho() {
        return this.iraisho;
    }


  /**
   * 印刷
   * @param data データテーブル
   * @throws Exception エラー
   */
  public void print(Datatable data) throws Exception {
      
      //帳票IDを取得する
      String idPrintId = (String)data.get(SAA510Define.ID_PRINT_ID);
      
      // 帳票IDの取得　変更2
      PrintLogic pl = new PrintLogic(idPrintId);

      ArrayList meisaiList = getIraisho(); 
      
      for (int i = 0; i < meisaiList.size(); i++) {

          SAA540IraishoPrintBean bean = (SAA540IraishoPrintBean) meisaiList.get(i);
      
          //1.現在のページ
          pl.addPrintStr("1");
          //2.全体のページ
          pl.addPrintStr("3");
          //3.タイトル
          pl.addPrintStr(getTitle(idPrintId));
          //4.見積依頼No
          pl.addPrintStr(bean.getUkagaiNo());
          //5.見積依頼年月日
          pl.addPrintStr(bean.getMitsumoriIraiYmd());
          //6.店所
          pl.addPrintStr("");
          //7.取引先コード
          pl.addPrintStr(bean.getTorihikisakiCode());
          //8.取引先名
          pl.addPrintStr(bean.getTorihikisakiMei());
          //9締切年月日
          pl.addPrintStr(bean.getMitsumoriShimekiriYmd());
          //10.部数
          pl.addPrintStr(bean.getSeikyuSu());
          
          //件名(工事・運送・委託)
          pl.addPrintStr(bean.getKemmei());
          
          //（複）品目仕様／運送区間（自）／工事場所／実施場所
          pl.addPrintStr(bean.getHimmeiSpec());

          //運送区間（至）・納工期（自）／（至）・支払条件編集
          if (idPrintId.equals(SAA510Define.ID_MITSU_REQ_PRINT_UNSO)) {
              //運送の場合
              //　運送区間（至）biko
              pl.addPrintStr(getUnsoKukanTo(bean.getShoriTaniId()));
              //支払条件
              pl.addPrintStr(bean.getShiharaiJokenMei1());
              //（複）予定納工期（自）
              pl.addPrintStr(bean.getYoteiNokokiFrom());
              //（複）予定納工期（至）
              pl.addPrintStr(bean.getYoteiNokokiTo());

          } else {
              //（複）予定納工期（自）
              pl.addPrintStr(bean.getYoteiNokokiFrom());
              //（複）予定納工期（至）
              pl.addPrintStr(bean.getYoteiNokokiTo());
              //支払条件
              pl.addPrintStr(bean.getShiharaiJokenMei1());
          }            
          //説明開催年月日＋時刻   てすと
          pl.addPrintStr(bean.getSetumeikaiKaisaiYmd() 
                  + "　" + bean.getSetumeikaiKaisaiTime());
          //集合場所
          pl.addPrintStr(getSetsumeiKaiBasho(bean.getMitsuReqId()));

          //備考
          pl.addPrintStr(getBiko(bean.getShoriTaniId()));

          //請求箇所
          pl.addPrintStr(bean.getSeikyuKikanMei());
          //担当
          pl.addPrintStr(bean.getSeikyuTantoMei());
          //購買箇所
          pl.addPrintStr(bean.getKobaiKikanMei());
          //担当
          pl.addPrintStr(bean.getKobaiTantoMei());

          //注意
          pl.addPrintStr(makeChuiBunshoPart(idPrintId));

          //-----------------------------
          //改ページ
          //-----------------------------
          pl.addCrLf();
      }

      //-----------------------------
      //出力
      //-----------------------------
      pl.setPdfFile(data);
      
      
  }
  
  /**
   * 印刷
   * @param data データテーブル
   * @param printId プリントＩＤ
   * @param meisaiList 明細リスト
   * @return Datatable データテーブル
   * @throws Exception エラー
   */
  public Datatable printDataAppend(Datatable data, String printId, ArrayList meisaiList) throws Exception {
      
      
      // 帳票IDの取得
      PrintLogic pl = (PrintLogic)data.getDatatableValue("PrintLogic");
      
      
      for (int i = 0; i < meisaiList.size(); i++) {

          SAA540IraishoPrintBean bean = (SAA540IraishoPrintBean) meisaiList.get(i);
      
          //1.現在のページ
          pl.addPrintStr(bean.getCurrentPage());
          //2.全体のページ
          pl.addPrintStr(bean.getTotalPage());
          //3.タイトル
          pl.addPrintStr(getTitle(printId));
          //4.見積依頼No
          pl.addPrintStr(bean.getUkagaiNo());
          //5.見積依頼年月日
          pl.addPrintStr(bean.getMitsumoriIraiYmd());
          //部門名（1行目）
          pl.addPrintStr(bean.getShitenMei());
// 2009.02.25 add J.Matsuo start U20080857
          //部門名（2行目）
          pl.addPrintStr(bean.getShitenMei2());
// 2009.02.25 add J.Matsuo end U20080857
          //7.取引先コード
          pl.addPrintStr(bean.getTorihikisakiCode());
          //8.取引先名
          pl.addPrintStr(bean.getTorihikisakiMei());
          //9締切年月日
          pl.addPrintStr(bean.getMitsumoriShimekiriYmd());
          //10.部数
//2006.01.26 t.tatsuki mod Start            
//        pl.addPrintStr(bean.getSeikyuSu());
          pl.addPrintStr(bean.getMitsumoriTeishutsuSu());
//2006.01.26 t.tatsuki mod End            
          //指値メッセージ
          pl.addPrintStr(bean.getSashineMsg());
          
// 2008.01.24 Sakamoto Shigefumi U-1966 del Start
          // //建設リサイクルメッセージ
          // pl.addPrintStr(SAA510Util.nullToBlank(bean.getRecycleMsg()));
// 2008.01.24 Sakamoto Shigefumi U-1966 del End
          
          //件名(工事・運送・委託)
          pl.addPrintStr(bean.getKemmei());
          
          //（複）品目仕様／運送区間（自）／工事場所／実施場所
          pl.addPrintStr(bean.getHimmeiSpec());

          //運送区間（至）・納工期（自）／（至）・支払条件編集
          if (printId.equals(SAA510Define.ID_MITSU_REQ_PRINT_UNSO)) {
              //運送の場合
              //　運送区間（至）biko
              SAA510Util util = new SAA510Util();
              String unsoKukanTo = util.getBikoUkagaiShoriTaniTUnsoKukanTo(data, Long.parseLong(bean.getShoriTaniId()));
              pl.addPrintStr(unsoKukanTo);
              //支払条件
              pl.addPrintStr(bean.getShiharaiJokenMei1());
              //（複）予定納工期（自）
              pl.addPrintStr(bean.getYoteiNokokiFrom());
              //（複）予定納工期（至）
              pl.addPrintStr(bean.getYoteiNokokiTo());
          } else {
              //（複）予定納工期（自）
              pl.addPrintStr(bean.getYoteiNokokiFrom());
              //（複）予定納工期（至）
              pl.addPrintStr(bean.getYoteiNokokiTo());
              //支払条件
              pl.addPrintStr(bean.getShiharaiJokenMei1());
          }
          
          //説明開催年月日＋時刻
          pl.addPrintStr(bean.getSetumeikaiKaisaiYmd() 
                  + "　" + bean.getSetumeikaiKaisaiTime());
          //集合場所
          pl.addPrintStr(getSetsumeiKaiBasho(bean.getMitsuReqId()));

//▼rkato added start 2006.03.29 for A1A01総-0142
          //見積質疑締切年月日
          pl.addPrintStr(bean.getShitsugiShimekiriYmd());
//▲rkato added end 2006.03.29 for A1A01総-0142
          
          //備考
          pl.addPrintStr(getBiko(bean.getShoriTaniId()));

          // 2014.05.09 H.Yamada U20140036 mod Start
          ////請求箇所
          //pl.addPrintStr(bean.getSeikyuKikanMei());
          ////担当
          //pl.addPrintStr(bean.getSeikyuTantoMei());
          // 2014.05.09 H.Yamada U20140036 mod End
          //購買箇所
          pl.addPrintStr(bean.getKobaiKikanMei());
          //担当
          pl.addPrintStr(bean.getKobaiTantoMei());

          //注意
          pl.addPrintStr(makeChuiBunshoPart(printId));

          //-----------------------------
          //改ページ
          //-----------------------------
          pl.addCrLf();

      }

      //-----------------------------
      //出力
      //-----------------------------
      data.putDatatableValue("PrintLogic" , pl);
      return data;
      
  }
  
  /**
   * 帳票タイトル取得<br>
   * 
   * 帳票タイトルを取得します。<br>
   * <br>
   * @param printId 帳票ID
   * @return String 帳票タイトル
   */
  public String getTitle(String printId) {
      
      String ret = "";
      
      if ( printId.equals(SAA510Define.ID_MITSU_REQ_PRINT_BUPPIN)) {
          ret = "物品見積依頼書";
      }
      
      if ( printId.equals(SAA510Define.ID_MITSU_REQ_PRINT_KOJI)) {
          ret = "工事見積依頼書";
      }
      
      if ( printId.equals(SAA510Define.ID_MITSU_REQ_PRINT_UNSO)) {
          ret = "運送見積依頼書";
      }

      if ( printId.equals(SAA510Define.ID_MITSU_REQ_PRINT_ITAKU)) {
          ret = "委託見積依頼書";
      }
      return ret;
      
  }

  /**
   * 注意文書部を表示します<br>
   * 
   * <br>
   * @param printId 帳票ID
   * @return 注文文書文字列
   * @throws Exception 例外
   */
  public String makeChuiBunshoPart( String printId ) throws Exception {
      
      String ret = "";
      String tmpStr = "";
      double dloopCnt = 0;

      int chuiBunshoMax = 0;
      /* 注意文書の文字数(-3は番号+全角空白) */
      int maxLength = 0;

      StringBuffer spece;
      StringBuffer speceWk;
      StringBuffer spece3 = new StringBuffer("   ");
      int addLength = 1;

//▼2007.06.22 t.tatsuki mod Start U20070348
//"注意文書"内容変更により、下記表示整形処理を修正。
      // ▼下記処理はメンテにて文字数変更が生じる度に変更しなければならない。
      // （帳票出力の行数増加に伴い、文字が自動で小さくなることにより、1行あたりの最大文字数が変化する。）
      spece = spece3;
      speceWk = spece3;
      if ( printId.equals(SAA510Define.ID_MITSU_REQ_PRINT_BUPPIN)) {
          
          // 2017.11.08 T.Tatsuki U20170253 mod Start
          // 2014.02.26 T.Tatsuki U20140294 mod Start
    	  // 2014.05.09 H.Yamada U20140036 mod Start
          chuiBunshoMax = 16;
          //chuiBunshoMax = 17;
          //chuiBunshoMax = 16;
          //chuiBunshoMax = 15;
    	  // 2014.05.09 H.Yamada U20140036 mod End
          // 2014.02.26 T.Tatsuki U20140294 mod End
          // 2017.11.08 T.Tatsuki U20170253 mod End

          // 2008.07.14 H.Yamada U20080311 mod Start
    	  // 2014.05.09 H.Yamada U20140036 mod Start
          maxLength = 89;
          speceWk = new StringBuffer("    ");
          spece = speceWk;
          addLength = 2;
          //maxLength = 87;
    	  // 2014.05.09 H.Yamada U20140036 mod End
          //maxLength = 84;
          // 2008.07.14 H.Yamada U20080311 mod Start
      } else if ( printId.equals(SAA510Define.ID_MITSU_REQ_PRINT_KOJI)) {
    	  // 2014.05.09 H.Yamada U20140036 mod Start
          chuiBunshoMax = 15;
          //chuiBunshoMax = 14;
    	  // 2014.05.09 H.Yamada U20140036 mod End
          // 2008.07.14 H.Yamada U20080311 mod Start
          maxLength = 81;
          //maxLength = 77;
          //speceWk = new StringBuffer("    ");
          //spece = speceWk;
          addLength = 1;
          //addLength = 2;
          // 2008.07.14 H.Yamada U20080311 mod Start
      } else if ( printId.equals(SAA510Define.ID_MITSU_REQ_PRINT_UNSO)) {
    	  // 2014.05.09 H.Yamada U20140036 mod Start
          chuiBunshoMax = 13;
          //chuiBunshoMax = 12;
    	  // 2014.05.09 H.Yamada U20140036 mod End
    	  // 2014.05.09 H.Yamada U20140036 mod Start
          maxLength = 73;
          //maxLength = 68;
    	  // 2014.05.09 H.Yamada U20140036 mod End
      } else if ( printId.equals(SAA510Define.ID_MITSU_REQ_PRINT_ITAKU)) {
//▼2009.10.27 k.miyamoto mod Start U20090226
//          chuiBunshoMax = 12;
    	  // 2014.05.09 H.Yamada U20140036 mod Start
          chuiBunshoMax = 14;
          //chuiBunshoMax = 13;
    	  // 2014.05.09 H.Yamada U20140036 mod End
//▲2009.10.27 k.miyamoto mod End U20090226
          // 2008.07.14 H.Yamada U20080311 mod Start
//▼2009.10.27 k.miyamoto mod Start U20090226
//          maxLength = 72;
//          speceWk = new StringBuffer("    ");
          maxLength = 75;
          speceWk = new StringBuffer("     ");
//▲2009.10.27 k.miyamoto mod End U20090226
          spece = speceWk;
//▼2009.10.27 k.miyamoto mod Start U20090226
//          addLength = 2;
          addLength = 3;
//▲2009.10.27 k.miyamoto mod End U20090226
          //maxLength = 68;
          // 2008.07.14 H.Yamada U20080311 mod End
      }
//▲2007.06.22 t.tatsuki mod End
      
      for (int i = 0; i < chuiBunshoMax; i++) {
          tmpStr = getChuiBunshoIdx(String.valueOf(i));

          int offSet = maxLength + 1;
          //注意文書が複数行に跨る場合は，注意文書番号＋空白分の隙間を作成する
          if (tmpStr.length() > offSet) {
              StringBuffer strBuff = new StringBuffer(tmpStr);
              //行頭禁則処理対応
              if (strBuff.charAt(offSet) == '、'
                  || strBuff.charAt(offSet) == '。'
                      || strBuff.charAt(offSet) == '）') {
                  offSet++;
                  spece = spece3;
              }
              strBuff = strBuff.insert(offSet, spece);
              tmpStr = strBuff.toString();
              
              spece = speceWk;
                            
              if (tmpStr.substring(offSet).length() > maxLength + 1) {
                  strBuff = new StringBuffer(tmpStr.substring(0,offSet));
                  StringBuffer strBuff2 = new StringBuffer(tmpStr.substring(offSet));                  
                  //行頭禁則処理対応
                  if (strBuff2.charAt(maxLength + 1) == '、'
                      || strBuff2.charAt(maxLength + 1) == '。'
                          || strBuff2.charAt(maxLength + 1) == '）') {
                      offSet = maxLength + addLength + 1;
                  } else {
                      offSet = maxLength + addLength;
                  }
                  strBuff2 = strBuff2.insert(offSet, spece);
                  tmpStr = strBuff.toString() + strBuff2.toString();
              }
          }
          ret = ret + ((i < 9)?" " + tmpStr.trim() : tmpStr.trim());

          if ( i != chuiBunshoMax ) {
              ret = ret + CRLF_CODE;
          }
      }
      
      return ret;
  }

  /**
   * 注意文書取得<br>
   * 
   * @param chuiBunshoNoSort 表示する注意文書のキーをソート順に並べた配列
   * @return String
   */
  public String getChuiBunshoTokutei(String[] chuiBunshoNoSort) {

      String ret = "";
      
      int j = 0;
      
      for (int i = 0; i < chuiBunshoNoSort.length; i++) {
          j++;
          ret = ret + ((j < 10)?" " + String.valueOf(j) : String.valueOf(j))
                  + " "  + getChuiBunshoIdx(chuiBunshoNoSort[i]);
          
      
          if ( i != chuiBunshoNoSort.length ) {
              ret = ret + CRLF_CODE;
          }
      }
      
      return ret;
  }
  
  
  
  
  /**
   * 備考取得
   * @param shoriTaniId 処理単位ID
   * @return String
   */
  public String getBiko(String shoriTaniId) {
      if ( hBiko == null || hBiko.size() <= 0) {
          return "";
      }
      return (String)hBiko.get(shoriTaniId);
  }
  /**
   * 備考設定
   * @param biko 備考
   */
  public void setBiko(HashMap biko) {
      hBiko = biko;
  }
  /**
   * 説明会集合場所取得
   * @param mitsuReqId 見積依頼ID
   * @return String
   */
  public String getSetsumeiKaiBasho(String mitsuReqId) {
      if ( hSetsumeiKaiBasho == null || hSetsumeiKaiBasho.size() <= 0) {
          return "";
      }
      return (String)hSetsumeiKaiBasho.get(mitsuReqId);
  }
  /**
   * 説明会集合場所設定
   * @param setsumeiKaiBasho 説明会集合場所
   */
  public void setSetsumeiKaiBasho(HashMap setsumeiKaiBasho) {
      hSetsumeiKaiBasho = setsumeiKaiBasho;
  }
  /**
   * 運送区間（至）取得
   * @param shoriTaniId 処理単位ID
   * @return String
   */
  public String getUnsoKukanTo(String shoriTaniId) {
      if ( hUnsoKukanTo == null || hUnsoKukanTo.size() <= 0) {
          return "";
      }
      return (String)hUnsoKukanTo.get(shoriTaniId);
  }
  /**
   * 運送区間（至）設定
   * @param unsoKukanTo 運送区間（至）
   */
  public void setUnsoKukanTo(HashMap unsoKukanTo) {
      hUnsoKukanTo = unsoKukanTo;
  }
  /**
   * 注意文書取得
   * @return chuiBunsho 注意文書
   */
  public HashMap getChuiBunsho() {
      return chuiBunsho;
  }
  /** TreeMapのインデックス
   * @param idx TreeMapのインデックス
   * @return chuiBunsho
   */
  public String getChuiBunshoIdx(String idx) {
      return (String)this.chuiBunsho.get(idx);
  }
  /**
   * 注意文書設定
   * @param achuiBunsho 注意文書
   */
  public void setChuiBunsho(HashMap achuiBunsho) {
      this.chuiBunsho = achuiBunsho;
  }
  /**
   * 物品見積依頼書（明細）取得
   * @return iraishoMeisai 物品見積依頼書（明細）
   */
  public HashMap getIraishoMeisai() {
      return iraishoMeisai;
  }
  /**
   * 物品見積依頼書（明細）取得（キー項目指定）<br>
   * 依頼書の明細を，キーを指定して取得します。
   * @param mitsuReqId 見積依頼ID
   * @param mitsuReqEdano 見積依頼枝番号
   * @return iraishoMeisai
   */
  public ArrayList getIraishoMeisai(String mitsuReqId, String mitsuReqEdano) {
      
      String hKey = SAA510Util.mitsuReqIdJoinEdaNo(mitsuReqId, mitsuReqEdano);
      
      ArrayList al = (ArrayList)iraishoMeisai.get(hKey);
      
      
      return al;
  }
  /**
   * 物品見積依頼書（明細）設定
   * @param airaishoMeisai 物品見積依頼書（明細）
   */
  public void setIraishoMeisai(HashMap airaishoMeisai) {
      this.iraishoMeisai = airaishoMeisai;
  }
  /**
   * 委託見積依頼書取得
   * @return itakuIraisho 委託見積依頼書
   */
  public ArrayList getItakuIraisho() {
      return itakuIraisho;
  }
  /**
   * 委託見積依頼書設定
   * @param itakuIraisho 委託見積依頼書
   */
  public void setItakuIraisho(ArrayList itakuIraisho) {
      this.itakuIraisho = itakuIraisho;
  }
  /**
   * 工事見積依頼書取得
   * @return kojiIraisho 工事見積依頼書
   */
  public ArrayList getKojiIraisho() {
      return kojiIraisho;
  }
  /**
   * 工事見積依頼書設定
   * @param kojiIraisho 工事見積依頼書
   */
  public void setKojiIraisho(ArrayList kojiIraisho) {
      this.kojiIraisho = kojiIraisho;
  }
  /**
   * 運送見積依頼書取得
   * @return unsoIraisho 運送見積依頼書
   */
  public ArrayList getUnsoIraisho() {
      return unsoIraisho;
  }
  /**
   * 運送見積依頼書設定
   * @param unsoIraisho 運送見積依頼書
   */
  public void setUnsoIraisho(ArrayList unsoIraisho) {
      this.unsoIraisho = unsoIraisho;
  }
  /**
   * 業務区分取得
   * @return gyomuKubun 業務区分
   */
  public String getGyomuKubun() {
      return gyomuKubun;
  }
  /**
   * 運送見積依頼書設定
   * @param aGyomuKubun 運送見積依頼書
   */
  public void setGyomuKubun(String aGyomuKubun) {
      this.gyomuKubun = aGyomuKubun;
  }
}

