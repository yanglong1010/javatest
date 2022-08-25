import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = new String[] {"foo","bar"};
        long start = System.currentTimeMillis();
        System.out.println(findSubstring(s, words));
        System.out.println(System.currentTimeMillis() - start);

        s = "wordgoodgoodgoodbestword";
        words = new String[] {"word","good","best","word"};
        start = System.currentTimeMillis();
        System.out.println(findSubstring(s, words));
        System.out.println(System.currentTimeMillis() - start);

        s = "wordgoodgoodgoodbestword";
        words = new String[] {"word","good","best","good"};
        start = System.currentTimeMillis();
        System.out.println(findSubstring(s, words));
        System.out.println(System.currentTimeMillis() - start);

        s = "barfoofoobarthefoobarman";
        words = new String[] {"bar","foo","the"};
        start = System.currentTimeMillis();
        System.out.println(findSubstring(s, words));
        System.out.println(System.currentTimeMillis() - start);

        s = "aratdgpfsookqyxiptwjllwirwmfdmafdayignqadektejbvcaepnbyezmlcalkfnkovaeydkixqsalwaqmptmwsajwaxifktvitbgwlqvdiwphyhtochmwhvujsdofymptnvpzlnewjtfhcaxghjeqhzzzepgebvxpqoqebuckqhuuhtbqdfgmghlmwuqypppiefofbqsrzooihpymwgyfnmrlgkjxzaffftnjlfamvoucfurecpjpdcblomjqnovukidvpgikwepebgidxttdxwomkzczqxuaizxxhfkembinjsqglllijcwubytryptgrrfyypekqmxzeqirbvclxyhbxcuxuodlfilfaqqsepulfecjzgwzfdaehubbkeorocxqunjycflkjqtkwpjbsjfbggdqmtibvhtpucqyjbisrbfosopmaxogdryqmitkpmzlrrkatuvmyaaqosdqpryukxkwhfgzuiklzwnurkhpkjfbbirsbqnlpzkyfsxbcimeebyxmhmyruzsctlglytaxfyeyyfcgtgmxfkjowjfqjyveldplwricppcnwevsnkpuuaisjoluoiyzlnkjeulwlpliujahtrdntlhczsxncxonlyxrvkngabowkqffjiuctbhvweiybxmoxlisvvzxyptkiyprijwcndxjjhhmgvbeijwegvdhnxrvxjoiskmfnloysylzvmfexbifznmmmgjkpxujkgpzrfyjfjkbxpfwtpbscqgpwrbnovwadlautyfahqbehiccxdwctcrrvuekrbkuokojktkrlnxvwzxtfuvayosuiygzzstqfjzpfljszinvilqphopfejzpihqjamzfvbuamftloiiyvbncrekvolkytbhtnjakkulwagkqquomvbomhykvkuvdxdykoyvyuiwwqgmgdasydjnlhxitreyrjwbxwyxritnacahfcbdgksrupzpjfoaomdnjekamepngpwlsxqakjrgasvjyjlowpcftohhuwwaounisgiepbkpthbtrmipbmuwcdgxzczpxnxrthxkijbeqcxhphysvuryxzxzbwoalmtgvsqedsiuwhdlrcgmwzmuyjvbijetxzatsszvmjrjqvwhzeuvdirbumdcyhxvizqaspygyprrmoyluuhyfabzpgbnpykyadasuyavosmaimocjxcoxgnooqdeqqeqtekpflktfyvnllruiwigexwsnaydqcwljgaotljyjgnwshsafaijzfdmfcsvgogruifovqohxcdrjwroyazyfcmmgejpsrgnzodvercdtfuedoueotcvyqhgvsvnjeciuhfazheupabuovycrczptixoatdlziutpbtqjzlaamuojvtaxsrsdpidkmplulejmzcxznzbbupkrinqdgjgvrlhdcsznylcynbzcbadxppoaeedlplihwqmzkoojbqjouksvkvubmidtoiegtonqgbrrrfcsynisxanjxhkmrqfhylnszckigbbxgdqeqawpblyyukmlarvzcitelfmtgnqosivkjtzmfxmzjznkqilvsgzflnytcpjwzegkyfwfejgnivzadkvyswdflcyptilsmrdmybrckasuvrxzeszyrceeecuxmfsbxxnvyhalhuhcnedrzcsqfwulyqlnwdovcbsaksnrmvwczztyelqljnwkdhxzmlwooprzheqwzoyzotzuhsfqfbailzkzkgobxfaflsdlhdmxylrhdwykzavkchkmpannhpuskxdrcrocfhkkdkvemqrozddodsbmivesuklybbbgintnxorjgiafldvqxxcfujzptmnwnqfxdymcoemwoobcrwuovxwqgxfbmuzznezselvsrhoivrmoqgeldcdlakomfonuuomzahttqkdndpdvwihzkknmxbaeroymcmneuiamudaytftpncqapdmmhnqadomhcbmwkmlgrneksazicqitvwfelxfontyqvkohyznrmuchubpytxsrvzvhxaxmuvcrhryhsnzfhbmdedcacwrxxmeupejjzlcjeaqxprexssazvezxaquyebuthdegrgrviisybwxuozvleuiemfeqizmpeqxvzprjzljakguagrmmlwszdxqlyeacuyavnrfmeomqxjrfcfrqbjpfihsgltlitldiekwibkzavsfyxyoajdhsnaayvliqyoycyunbgobcggcfgqhqvpkirkjmytcwhcbiyojeelimtkracysypcigotuopynwaoeyeqfibnuwynwcnqcdsnljggxxemuhaafgskovaksyzqcnhfsbsdkalkyswuzzugfnrwiricritvvaandssoveatwynxxjdfywbjpllitgeoiedmzwcwccpyaexapafqzizotmxntddbjhnifrghtxhwdewtgblfjkwcyvrravvjeiujaasvyzrbfnwlqhtbrrgqoxjouexyprjrsdmscgtjvqxoxsprjvjzvunpzkqqebhyfvqjdjtzbspbkeuvcduxxhoytgoxkvvptnawxvxanmbzrvuvaouavkyprpobkmsfzucyqzzfoafhyzcaoyalizczorcafuiepkdhlcmberietmfhkhutgxuwqxzvthbktergieipxqvqfazpiuiqrdphcqevzfgsmzaudildbhtgjvvtpgmglbpptvksasmosmlxvwawfweprbkghwouzfjsawmcqyrilcggaieggkxzlhhvgvrfcbaczmhpnayyeggeqmkzwjyjrgezdwegzgkytrpgtpgxxmcoaopwynhrtmqzkwfjdrjylageqocncgdcusaughnbtfcfchqhbbhmcpssduhfaljxdjtlqhpmmrrqbkzcliqnxihcfpjhcsehdatwhkivbboennizwyovjwyonhvpccyfctbldlghpulckwdgusbfobtdlruntsuvmyiplowalkfvgibcaeiqgdvrupgnickwasnmjkouwvpegsgiwqbeuwxoofeyiquijhwutnorkfvqxezvuaaoyzfmfjknzgxkowgjlubvzwoycnuxpwnnvsccdorfvprlnyuyuvvuujswyovpkjdidhkjveoqvfbifyiatfuproopflfpukzarmjmqxfleivkgdkckgrbwhtbtytpkspdeyruxwhefcqlhcnsihvgookjodzyxodcpvyorisykimukboukjdbankosjppastpnufhcyhoivivxwphisiihvwzenregkvvebcgbmxlhfggewomqywatsbagsgodcjjfosiaptjwcqaagoseksafuanoibrmmdtavbcmxmizcjzizrokmqrgseubhontrhwokyahmiiqthyvbpfnfwvycrzjhmeyvaogboppzyguhgpkvwxbuuzwmahtomukoksrbhhafnwptozpkzshttdhtndhzztpjlhkvomadlrwzrnlsfsnayxtladmbybkmixhyjjbwbavunjmvbzvbwrmywyzwcmikjplszmrammwcvizzjwagpngnngkpsscbinvjbmjqbfsyptxyraghpnueveupxyshlpqoebehiyfxtfxlfeswtoaqtwhsuzzhqrwuscbabjxuqwfxaztvotnjqubmtcuktsgnuknxvmulkbilbbirwwaoqdbmhxycrgpnqellshycigpjjycgwcumhxaowysnfhbxnolhvjkdqbpzbthxycmfbmwynonsyqpleatbmfhcgydkrlhpnvxqktoxjerhugvzjqcvxjzfhcpbnzqcupteijdunudkdyjmqnjnxkvgmkhcjaegpzmalquakxknyvbojmeiwzollynvytdpvrpghlgulthjolzxxdfwewhquwnupslmjbsroblzuuikhkkfnrbunkmjgzfxrrkcuctifgibdqmkcwrsnumdeyokzukqlushyopgwxhzqtmsrdkhyykewyrvubnhxiovwebudjwveioynafnzrsxrltmmitjqkgooiltthpzrdzefeuexocpzxbnhwyageowozqjihjzmigrpaymqcdpzgcidailgxkvyaejjpivaqmpskdimhznnbwsdegmdqheqnnzfxwfqiwivbthksxawvsbbynhowlgmahrzdypouajvtsilpihkajobwvrviyhihyjnwbbsbmpuexhufpgiaujyratzachkctzauasvmkrsjaoprxzrrislklknqszsnythaneoxxghxvypsxilhawtohiebhyqhrxhhdvgaepzbnqvmzgtbfppoxvrfuhongwujtblxqmygdtsecofjdxxasqhoxwcfuyqnbbnuplashuyjiesnbrqvhzkgxmlrmbhoeuithiooeoznstcvmsttsdbrrojdrsrvmbrtlhkqvlfqfhnrcgnulqlcfwiwobucdnyowketvjlctzuvhjrtzexedfdrhzwkmuakghdbsrelsaibjzukeuphzuaityuhuvtaeyewpiihkqjtsfdybufbqhlliiucdndjmhfdrpnbgwwadzyfwfimovawduziierwlxzemmfukbuocsvyzfnoankejjmrnepadpepdjkomgepbzpageogtzkdizwydmyiddxgojubqystzhtfmiofhykrzhpevomytkehvbknbcgdmakyiyfrzsiybadwqpwjzcsxdfkhhrkvtuvbtdssvcqwcvuslqdmsyjydufmnrigldjggdadftzkotezlimeixeltjxgahonlxwtcwxkpyuguaffktlsrpdmydtakjqxjmtliqxaqrgkunqejbxctcorhjustkrewkpgcngtgodcevhpzgrskhlsrfmmrdqpqhwswelfvrhzoqonyhhjotbhaptusljivfbrmoyhhigwywlxdtirojzoyuisiuddbgwnuxwefccdapcdkkxyvyptszoctrfvxektbhzilblororbyqcworpjqflmwtjvztpacqkqsvellvommqiajzlafxodqxbpqsrviblaypnkmeyyugbehmgolwsbtvslnjgvkrylinvvrvvmbwsilazwwraroscbejyqcwblkygdtbrualfnleljxlclgfokqmaslefxclawpssrdzerdrccffplkdxaszuddaainaeeswvywbpbvtgayvnkbkmtlhwrjyzyyddtbatzcidxbjzcgmmjyzejicarabpbeuuivphxxkwavvcejrnhqusawvrxwiyddulyjuxifvkcspgbgwkyqeamzrlyblbghogsifapansscavkwfkokkdldojgcmnjavclbeabrswvvrhtzrildlwgbindwcpzxrkyvkcpfykarutslbdpocxskkxgomfmfrmbcoshmehgyaymecbueamqlmybygnexahzobidfplgsjsynvstvhlitkktszzpzirqjbvptgxlrplhkfahmoqhaadszcjblctweonxwkkpzxwlcztrnjynldhmiqnvvgrzwfyurkkthgejhzawkbjxeskolxjggbheihzzrjsarzjbymxlpjivbskostuaudeckfedowdivplwbihqtpnxixlcricllgqymubcsfmowxkzirrbieaqcmstuwgffwdrshvlokbkjnjtgaxogxhijbbfyildgqwbzrondpznckiimfytdfbmhfsfpfkvxgyxzmmddosfyaplgqelvhzemtjbatzybxxbmlgpzyxyaoliertcytgnosoplppppmqbzwszwpzygmhkdcmdxtqmlhbywqpnefqddjebadagpjtulhyjaovnxyowodjulaxolcsnhsuzbptowtxziuohscdiinctpcjagbnnvjoyaknxdkynfmvzryiznmscodewfumafazgmodsydhfpcfgdpfsdzxudbqkvcmbdnjrbmjarrhgvonafut";
        words = new String[] {"vkyprpobkmsfzucyqzzfoafhyzca","gdvrupgnickwasnmjkouwvpegsgi","jzukeuphzuaityuhuvtaeyewpiih","syzqcnhfsbsdkalkyswuzzugfnrw","kygdtbrualfnleljxlclgfokqmas","pqoqebuckqhuuhtbqdfgmghlmwuq","ycrgpnqellshycigpjjycgwcumhx","vgogruifovqohxcdrjwroyazyfcm","lefxclawpssrdzerdrccffplkdxa","vyqhgvsvnjeciuhfazheupabuovy","fexbifznmmmgjkpxujkgpzrfyjfj","qthyvbpfnfwvycrzjhmeyvaogbop","rvvmbwsilazwwraroscbejyqcwbl","jzlafxodqxbpqsrviblaypnkmeyy","vrhzoqonyhhjotbhaptusljivfbr","trfvxektbhzilblororbyqcworpj","sybwxuozvleuiemfeqizmpeqxvzp","bxgdqeqawpblyyukmlarvzcitelf","tjxgahonlxwtcwxkpyuguaffktls","ebhyfvqjdjtzbspbkeuvcduxxhoy","rplhkfahmoqhaadszcjblctweonx","obxfaflsdlhdmxylrhdwykzavkch","hykrzhpevomytkehvbknbcgdmaky","tuvbtdssvcqwcvuslqdmsyjydufm","bkmtlhwrjyzyyddtbatzcidxbjzc","nrigldjggdadftzkotezlimeixel","tjqkgooiltthpzrdzefeuexocpzx","astpnufhcyhoivivxwphisiihvwz","plashuyjiesnbrqvhzkgxmlrmbho","ieaqcmstuwgffwdrshvlokbkjnjt","dewtgblfjkwcyvrravvjeiujaasv","hzeuvdirbumdcyhxvizqaspygypr","bbupkrinqdgjgvrlhdcsznylcynb","mwzmuyjvbijetxzatsszvmjrjqvw","lsxqakjrgasvjyjlowpcftohhuww","datwhkivbboennizwyovjwyonhvp","stuaudeckfedowdivplwbihqtpnx","chkctzauasvmkrsjaoprxzrrislk","sypcigotuopynwaoeyeqfibnuwyn","izwydmyiddxgojubqystzhtfmiof","rsrvmbrtlhkqvlfqfhnrcgnulqlc","tmfhkhutgxuwqxzvthbktergieip","kmpannhpuskxdrcrocfhkkdkvemq","pvyorisykimukboukjdbankosjpp","fahqbehiccxdwctcrrvuekrbkuok","nuuomzahttqkdndpdvwihzkknmxb","agpngnngkpsscbinvjbmjqbfsypt","zcbadxppoaeedlplihwqmzkoojbq","bgwnuxwefccdapcdkkxyvyptszoc","xzeszyrceeecuxmfsbxxnvyhalhu","evhpzgrskhlsrfmmrdqpqhwswelf","euithiooeoznstcvmsttsdbrrojd","ibdqmkcwrsnumdeyokzukqlushyo","babjxuqwfxaztvotnjqubmtcukts","kqjtsfdybufbqhlliiucdndjmhfd","csynisxanjxhkmrqfhylnszckigb","dtsecofjdxxasqhoxwcfuyqnbbnu","owkqffjiuctbhvweiybxmoxlisvv","kbxpfwtpbscqgpwrbnovwadlauty","nepadpepdjkomgepbzpageogtzkd","mmhnqadomhcbmwkmlgrneksazicq","rjgiafldvqxxcfujzptmnwnqfxdy","tgoxkvvptnawxvxanmbzrvuvaoua","oyalizczorcafuiepkdhlcmberie","wcnqcdsnljggxxemuhaafgskovak","tfcfchqhbbhmcpssduhfaljxdjtl","gdryqmitkpmzlrrkatuvmyaaqosd","zmhpnayyeggeqmkzwjyjrgezdweg","qflmwtjvztpacqkqsvellvommqia","rbhhafnwptozpkzshttdhtndhzzt","kqmxzeqirbvclxyhbxcuxuodlfil","epnbyezmlcalkfnkovaeydkixqsa","crczptixoatdlziutpbtqjzlaamu","avclbeabrswvvrhtzrildlwgbind","jbxctcorhjustkrewkpgcngtgodc","xwhefcqlhcnsihvgookjodzyxodc","vgmkhcjaegpzmalquakxknyvbojm","pjlhkvomadlrwzrnlsfsnayxtlad","rzheqwzoyzotzuhsfqfbailzkzkg","pbnzqcupteijdunudkdyjmqnjnxk","zxxdfwewhquwnupslmjbsroblzuu","zselvsrhoivrmoqgeldcdlakomfo","qjamzfvbuamftloiiyvbncrekvol","xyowodjulaxolcsnhsuzbptowtxz","puuaisjoluoiyzlnkjeulwlpliuj","dpzgcidailgxkvyaejjpivaqmpsk","mfbmwynonsyqpleatbmfhcgydkrl","qhpmmrrqbkzcliqnxihcfpjhcseh","pflktfyvnllruiwigexwsnaydqcw","mdedcacwrxxmeupejjzlcjeaqxpr","bnhwyageowozqjihjzmigrpaymqc","njsqglllijcwubytryptgrrfyype","moyhhigwywlxdtirojzoyuisiudd","gaxogxhijbbfyildgqwbzrondpzn","qpryukxkwhfgzuiklzwnurkhpkjf","rjzljakguagrmmlwszdxqlyeacuy","eivkgdkckgrbwhtbtytpkspdeyru","ikhkkfnrbunkmjgzfxrrkcuctifg","sdmscgtjvqxoxsprjvjzvunpzkqq","mywyzwcmikjplszmrammwcvizzjw","ixlcricllgqymubcsfmowxkzirrb","ahtrdntlhczsxncxonlyxrvkngab","lruntsuvmyiplowalkfvgibcaeiq","wqpnefqddjebadagpjtulhyjaovn","eiwzollynvytdpvrpghlgulthjol","tqfjzpfljszinvilqphopfejzpih","gnuknxvmulkbilbbirwwaoqdbmhx","ypouajvtsilpihkajobwvrviyhih","smlxvwawfweprbkghwouzfjsawmc","uvvuujswyovpkjdidhkjveoqvfbi","vyswdflcyptilsmrdmybrckasuvr","avnrfmeomqxjrfcfrqbjpfihsglt","rpdmydtakjqxjmtliqxaqrgkunqe","pmqbzwszwpzygmhkdcmdxtqmlhby","vvcejrnhqusawvrxwiyddulyjuxi","aounisgiepbkpthbtrmipbmuwcdg","nlhxitreyrjwbxwyxritnacahfcb","wivbthksxawvsbbynhowlgmahrzd","zxyptkiyprijwcndxjjhhmgvbeij","zgkytrpgtpgxxmcoaopwynhrtmqz","zgtbfppoxvrfuhongwujtblxqmyg","kvkuvdxdykoyvyuiwwqgmgdasydj","jouksvkvubmidtoiegtonqgbrrrf","yjnwbbsbmpuexhufpgiaujyratza","zflnytcpjwzegkyfwfejgnivzadk","eksafuanoibrmmdtavbcmxmizcjz","qyrilcggaieggkxzlhhvgvrfcbac","ayvliqyoycyunbgobcggcfgqhqvp","wqbeuwxoofeyiquijhwutnorkfvq","lgkjxzaffftnjlfamvoucfurecpj","yxzxzbwoalmtgvsqedsiuwhdlrcg","pdcblomjqnovukidvpgikwepebgi","lwaqmptmwsajwaxifktvitbgwlqv","zlnewjtfhcaxghjeqhzzzepgebvx","jowjfqjyveldplwricppcnwevsnk","hcnedrzcsqfwulyqlnwdovcbsaks","kwfjdrjylageqocncgdcusaughnb","mlgpzyxyaoliertcytgnosoplppp","nvstvhlitkktszzpzirqjbvptgxl","ccyfctbldlghpulckwdgusbfobtd","faqqsepulfecjzgwzfdaehubbkeo","dgksrupzpjfoaomdnjekamepngpw","dosfyaplgqelvhzemtjbatzybxxb","bbirsbqnlpzkyfsxbcimeebyxmhm","kirkjmytcwhcbiyojeelimtkracy","yruzsctlglytaxfyeyyfcgtgmxfk","fxtfxlfeswtoaqtwhsuzzhqrwusc","xzczpxnxrthxkijbeqcxhphysvur","itvwfelxfontyqvkohyznrmuchub","fwiwobucdnyowketvjlctzuvhjrt","awtohiebhyqhrxhhdvgaepzbnqvm","mbybkmixhyjjbwbavunjmvbzvbwr","ywbjpllitgeoiedmzwcwccpyaexa","pgwxhzqtmsrdkhyykewyrvubnhxi","iricritvvaandssoveatwynxxjdf","zexedfdrhzwkmuakghdbsrelsaib","ypppiefofbqsrzooihpymwgyfnmr","lknqszsnythaneoxxghxvypsxilh","rocxqunjycflkjqtkwpjbsjfbggd","qmtibvhtpucqyjbisrbfosopmaxo","nrmvwczztyelqljnwkdhxzmlwoop","vosmaimocjxcoxgnooqdeqqeqtek","exssazvezxaquyebuthdegrgrvii","yzrbfnwlqhtbrrgqoxjouexyprjr","hpnvxqktoxjerhugvzjqcvxjzfhc","ifapansscavkwfkokkdldojgcmnj","gmmjyzejicarabpbeuuivphxxkwa","mtgnqosivkjtzmfxmzjznkqilvsg","aeroymcmneuiamudaytftpncqapd","ovwebudjwveioynafnzrsxrltmmi","litldiekwibkzavsfyxyoajdhsna","wkkpzxwlcztrnjynldhmiqnvvgrz","szuddaainaeeswvywbpbvtgayvnk","kkxgomfmfrmbcoshmehgyaymecbu","dimhznnbwsdegmdqheqnnzfxwfqi","xqvqfazpiuiqrdphcqevzfgsmzau","eamqlmybygnexahzobidfplgsjsy","pytxsrvzvhxaxmuvcrhryhsnzfhb","wegvdhnxrvxjoiskmfnloysylzvm","xezvuaaoyzfmfjknzgxkowgjlubv","pafqzizotmxntddbjhnifrghtxhw","lxzemmfukbuocsvyzfnoankejjmr","rpnbgwwadzyfwfimovawduziierw","rozddodsbmivesuklybbbgintnxo","izrokmqrgseubhontrhwokyahmii","ojvtaxsrsdpidkmplulejmzcxznz","diwphyhtochmwhvujsdofymptnvp","dildbhtgjvvtpgmglbpptvksasmo","rmoyluuhyfabzpgbnpykyadasuya","ojktkrlnxvwzxtfuvayosuiygzzs","ugbehmgolwsbtvslnjgvkrylinvv","mcoemwoobcrwuovxwqgxfbmuzzne","aowysnfhbxnolhvjkdqbpzbthxyc","mgejpsrgnzodvercdtfuedoueotc","fyiatfuproopflfpukzarmjmqxfl","zwoycnuxpwnnvsccdorfvprlnyuy","ckiimfytdfbmhfsfpfkvxgyxzmmd","kytbhtnjakkulwagkqquomvbomhy","dxttdxwomkzczqxuaizxxhfkembi","fvkcspgbgwkyqeamzrlyblbghogs","wcpzxrkyvkcpfykarutslbdpocxs","enregkvvebcgbmxlhfggewomqywa","iyfrzsiybadwqpwjzcsxdfkhhrkv","wfyurkkthgejhzawkbjxeskolxjg","xyraghpnueveupxyshlpqoebehiy","gbheihzzrjsarzjbymxlpjivbsko","pzyguhgpkvwxbuuzwmahtomukoks","tsbagsgodcjjfosiaptjwcqaagos","ljgaotljyjgnwshsafaijzfdmfcs"};
        start = System.currentTimeMillis();
        System.out.println(findSubstring(s, words));
        System.out.println(System.currentTimeMillis() - start);
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                map.put(words[i], map.get(words[i]) + 1);
            } else {
                map.put(words[i], 1);
            }
        }
        int totalLength = words[0].length() * words.length;
        int length = words[0].length();
        for (int i = 0; i <= s.length() - totalLength; i++) {
            String subString = s.substring(i, i + totalLength);
            if (subString.length() < length) {
                break;
            }
            if (!split(subString, map, length).isEmpty()) {
                list.add(i);
            }
        }
        return list;
    }

    private static List<String> split(String text, Map<String, Integer> map, int length) {
        List<String> list = new ArrayList<>();

        String subStr = text.substring(0, length);
        if (!map.containsKey(subStr)) {
            return list;
        }

        String remain = text.substring(length);
        List<String> remainList;
        if (remain.length() == 0) {
            AtomicInteger v = new AtomicInteger();
            map.values().forEach(v::addAndGet);
            if (v.get() == 1) {
                list.add(subStr);
            }
        } else {
            int tmp = map.get(subStr);
            if (tmp > 1) {
                map.put(subStr, tmp - 1);
            } else {
                map.remove(subStr);
            }
            remainList = split(remain, map, length);
            if (map.containsKey(subStr)) {
                map.put(subStr, tmp);
            } else {
                map.put(subStr, 1);
            }

            if (remainList.size() > 0) {
                list.add(subStr);
                list.addAll(remainList);
            }
        }

        return list;
    }
}

