package garyMalone.com.Main;

import garyMalone.com.Days.Day1;

public class Day1Main {
	public final static String DAY_ONE_INPUT = "2911threeninesdvxvheightwobm\r\n" + 
			"3three16xsxhpnqmzmnine8one\r\n" + 
			"seven5khtwo891hlb\r\n" + 
			"sixthreeqpzjpn195\r\n" + 
			"jrnf3\r\n" + 
			"qpzcfbfsrxthreenine3ksbghzzffsevenfive9\r\n" + 
			"2fxvxzzgdnfkzzh4eightnine7five\r\n" + 
			"4fourtwobjscjgtbvninesix\r\n" + 
			"onetwofivelvnbcbn5\r\n" + 
			"6vjdtd1j1eightone\r\n" + 
			"sshnxbjrt1\r\n" + 
			"5ljsxqjdxr91\r\n" + 
			"71six14rkdhdszbfz\r\n" + 
			"khlm3\r\n" + 
			"jnsjhqqtj6fourslpqntdzxpfive\r\n" + 
			"6eightp\r\n" + 
			"qtqrcs6gdqmtznninexvpnrn\r\n" + 
			"sevenrcdbnzfltt4seven3nzsixthreeszr\r\n" + 
			"onefour96qtffc\r\n" + 
			"klpksqsggbrffive1tdsfptnvs72\r\n" + 
			"lsx3qrmznjrfnvvzveight5one\r\n" + 
			"dqlrxck2fourkp6two464\r\n" + 
			"5niner3kcdsxqfoureightfive\r\n" + 
			"lqtwo7sevensvghmsdjzbbdrhqjg4\r\n" + 
			"xxtwo25\r\n" + 
			"six6zxs8four8two\r\n" + 
			"four7five3mcmhxxtm6\r\n" + 
			"oneqdkmbvvnmf64three57\r\n" + 
			"9fourjgmhcnpjfhtm\r\n" + 
			"3lzjfvthreesevenzlbgpcslvrpglqseven\r\n" + 
			"6eight1\r\n" + 
			"xxcgtrqzcjjtwosix7ninejzzsg3\r\n" + 
			"1cqxsix\r\n" + 
			"5tjmqldjsixsevenfour4fxxgsbjbxrffvzbxd\r\n" + 
			"nine2mpcplqktt\r\n" + 
			"rldf79eightonedfjvkvjjx\r\n" + 
			"3fiveeightoneightg\r\n" + 
			"95six4three\r\n" + 
			"kfn487oneone1mckljv3\r\n" + 
			"2four6lcbvninezscnjjztwo3two\r\n" + 
			"469sevensixthree\r\n" + 
			"vqvjll1seven78four\r\n" + 
			"1fmstxpg9\r\n" + 
			"onefxtvjhxmfbgmf1three\r\n" + 
			"threefivesix8onebxpdfkxddkdxnt\r\n" + 
			"ninevkcxflcfhqx664\r\n" + 
			"328threexc4onetwo7\r\n" + 
			"nine51\r\n" + 
			"threefoureightv2\r\n" + 
			"six58jsq69\r\n" + 
			"63gzvtseven3eightmnbrmtktseventhree\r\n" + 
			"3onepszzgskhjl6oneeight\r\n" + 
			"llrrxkmrvz2three53\r\n" + 
			"sevensevenvtqdnvf7qhjt1\r\n" + 
			"53eightkfrrtvsq\r\n" + 
			"ninefxltvtgmrlhhdkbtbsevendrpgrcrq3two\r\n" + 
			"m5hxxkgoneqfgmhndbdslvrjrnk5five\r\n" + 
			"fourf9one3bzljjkdl\r\n" + 
			"7drfddqr4gzthreefour\r\n" + 
			"seven61ninethreeln\r\n" + 
			"3spmthreeltlkfmcdvlfxvbnlmgsnsqskh3five\r\n" + 
			"k93nine\r\n" + 
			"jpbdrbvtpgzlfnqzfourfive79tmnhdm6two\r\n" + 
			"dfqg4ghxvnrzstd4four52hzqkdpkdnb\r\n" + 
			"85dsixsevenmpcclxdjvsvppkpflhxqvgsjnbsvlcgv\r\n" + 
			"threecvfdcnxfoursix8xjzcdtbnine\r\n" + 
			"rgcxrc9nineeightwoxcb\r\n" + 
			"three72\r\n" + 
			"tpfrhlnkdptwo9vgqvdgfqdg9ninemrzeight\r\n" + 
			"8twonqffivelnlmpgmtwonine\r\n" + 
			"snqgdxsczh5nineeightthreezqxmptlss9seven\r\n" + 
			"zvsmmlgt8mzlhvbfftqnn6sevenfive\r\n" + 
			"vfvdxfx1fourseven3194\r\n" + 
			"8j71psdplqssbhvxhbxzfivefive\r\n" + 
			"dhbtmxvfjjkdkdvr6\r\n" + 
			"mnkhzskxoneoneeightseventhreeseven3\r\n" + 
			"sevenzzrt3vfcsxmqgh4\r\n" + 
			"nbkxmzzcxtpqzvtninevfceight3tjqzsbq\r\n" + 
			"j2\r\n" + 
			"four53lz\r\n" + 
			"jkrxvxl7pfq\r\n" + 
			"bkfvvnrqsqfrmbzfournine9\r\n" + 
			"eightonekgcgdpvqksthf9\r\n" + 
			"jqseightfbdqxzllfrnnth4\r\n" + 
			"2gfhfpvqzs6vhcvjlrcsevenone\r\n" + 
			"78tworxggpzr\r\n" + 
			"kst8eightsvvfzblthreethree\r\n" + 
			"63three9clsnvmkd\r\n" + 
			"2nfrb95hsrcqcnrvlqtnt\r\n" + 
			"71sevendmtwotdvz\r\n" + 
			"kzkjqsseven6gqdkt\r\n" + 
			"sevenseventjsvjsix6fnggzkvnine\r\n" + 
			"262\r\n" + 
			"5371twonine2fivetwonepb\r\n" + 
			"7g\r\n" + 
			"eighteight9\r\n" + 
			"5xfjm\r\n" + 
			"txhninezhplccmvkj2\r\n" + 
			"dzxgmrjzthreedxtqthreecrkqgqhthree8\r\n" + 
			"9vngn\r\n" + 
			"5mngdkppsix9mtxzxjlmfz9one\r\n" + 
			"6seven5threeseven8seven\r\n" + 
			"9dxpznmpjv3eightsix\r\n" + 
			"6foursevenx\r\n" + 
			"twoseven1\r\n" + 
			"five1eightfqgbmtzone\r\n" + 
			"fgl424seven\r\n" + 
			"7177fvc8rkdptrfour\r\n" + 
			"6sixbbhp89\r\n" + 
			"four8twovpkrtnshhone5zfnpvfdl\r\n" + 
			"4threebmrpbhrnfpn\r\n" + 
			"three2vrxztxn4xt1one\r\n" + 
			"threetwo71\r\n" + 
			"fivetwo6sixzfzxbgqeighttqfour\r\n" + 
			"hbbgfhrqvxpqfourthree41\r\n" + 
			"oneeight3xqlvnb56dtwo\r\n" + 
			"666two8\r\n" + 
			"24kgvqpqtngmlrtfmqfqprvrxzqsxjffour5rvffnntblhnr\r\n" + 
			"dhmhrdntwo6\r\n" + 
			"grkqnbfeightsevenjpvqmhmbxljrlthsixthree5czqlcvm\r\n" + 
			"eightnjbjnpl6three\r\n" + 
			"dxstwonesevenbqtqpjs5five\r\n" + 
			"eightgrbmmnine7\r\n" + 
			"1one9\r\n" + 
			"bqhbdkf3nine\r\n" + 
			"sixjbckxghxr5xh\r\n" + 
			"fivespsvx35five\r\n" + 
			"5foursixninedl6\r\n" + 
			"xcbgsjhsix3threelbntcllhdjvqgone\r\n" + 
			"seventwo1\r\n" + 
			"rdfqxlh8sixcqknsix1onethree\r\n" + 
			"9b7sdpqsg5gn\r\n" + 
			"threetwofourfive6fivesfive\r\n" + 
			"k7\r\n" + 
			"mzhthreerlrmfhzzlgzclmngn5sevenlxqnbq7\r\n" + 
			"1seven9621\r\n" + 
			"fourvgrmxqkfqtbfivelvm312nsdjjhqcqs\r\n" + 
			"fvnine8\r\n" + 
			"fourpcvmdzbzsix7bqdffvsgvd\r\n" + 
			"51threeonemlccggqsxqthree\r\n" + 
			"14nine5rrzfseven3nine\r\n" + 
			"gcq3nkkgdjlcdmjvrpthree7\r\n" + 
			"sevenh4grcmgl\r\n" + 
			"shjjpzcrljpmfsevennine4\r\n" + 
			"five1sevendpjthd1\r\n" + 
			"dncxsx3drbllpfxp75chrvhvbblsnrxshssjxvztljmqgb\r\n" + 
			"bkrhmrbqtzznhzdt5ccnlxvnlvsdnsk\r\n" + 
			"3drxdrxsclrpt\r\n" + 
			"7eightsix\r\n" + 
			"fourhdbsgsj79six\r\n" + 
			"5fiveeightninesixeightm44\r\n" + 
			"four2five4rjnth3sone\r\n" + 
			"threesixseven3\r\n" + 
			"onenine45three\r\n" + 
			"nine2qcrgnphbmnkronesix\r\n" + 
			"dsmbgbhgrvone768bvlznvfivesixnine\r\n" + 
			"four2three9\r\n" + 
			"66onesix\r\n" + 
			"fhtqmgrz22lhqrhngrjd7\r\n" + 
			"8fiveonetwovd5onembnqk\r\n" + 
			"spzzrkdf2\r\n" + 
			"92cgtsxninesixeightthree\r\n" + 
			"41n1two8bfrnqclvrxghmbtdtskv\r\n" + 
			"mgmqskkcgf4zrttjstmfsnineggdnbbvnfour7eight\r\n" + 
			"sevenjpdbdqh9cxvvzgbhtzntn59\r\n" + 
			"ljh34fouronemonerk\r\n" + 
			"68one6271\r\n" + 
			"5sffblcpghqvqxfive7ninev\r\n" + 
			"nineeight6bzvsdcks\r\n" + 
			"5ndsk4\r\n" + 
			"vsix5twosevendv2\r\n" + 
			"4dvvtzjvcxr3eight5two\r\n" + 
			"bmzrnveightthreesevensixsixbfplfcx3five\r\n" + 
			"5tmkgbdrj\r\n" + 
			"91tnkfconeb\r\n" + 
			"cvfrdpkqtmbcrrzfz4v59cvglzjxseven\r\n" + 
			"7five6pz\r\n" + 
			"4svjpkzv6\r\n" + 
			"6476sixq4\r\n" + 
			"3f\r\n" + 
			"1qlbcrdgg\r\n" + 
			"9dzrjgr\r\n" + 
			"spcsbjmfdlqnqdxthreefourdhpzzqkcxlfour2\r\n" + 
			"eight7eight145cmllsqfhj\r\n" + 
			"7lb73mfhnhflp\r\n" + 
			"2sevenfive\r\n" + 
			"kxgtbtcfour7twotdsj\r\n" + 
			"eight72bcbtwohtjjdcpprfldglsix\r\n" + 
			"eightgjrxptfdsvcpjnine7sevensixfrbnkdxl\r\n" + 
			"onefive3bfdtfnjkhdsrzthreefour\r\n" + 
			"xnsevenxxgckdztxf628nine\r\n" + 
			"2qfq\r\n" + 
			"nbxd75hrdqnmfive2onenlchjfoneightlh\r\n" + 
			"6seventwofiveqfscgschrpjp2\r\n" + 
			"skeightwofive4\r\n" + 
			"5bfjpsmdl\r\n" + 
			"tjdnlshngvsnrbvmch69tqnslrhmkthree\r\n" + 
			"5sixfiveseven1ninenineonec\r\n" + 
			"26xclfjhbxplseven\r\n" + 
			"oneoneh24229\r\n" + 
			"two57twolpcnine8three\r\n" + 
			"nznzdxxvrqninesevenrphxk48tmsj7\r\n" + 
			"threelctkpmbkp38\r\n" + 
			"eightsixthreepvxxntfqdcsx2\r\n" + 
			"nrzg4three1sdggv9two\r\n" + 
			"3c2cgglrzk\r\n" + 
			"ktbzmhmtx5sixglkfnfseven7\r\n" + 
			"4plzqdltwoptkndtbxpt7\r\n" + 
			"fourrzcxbkpxthree8four\r\n" + 
			"nine9ccsgftlfxpgvgt\r\n" + 
			"1five3\r\n" + 
			"two9fhprhfkkljvgfgfgftskpndhqxtrnfxsndfourzbrrl9\r\n" + 
			"59svdgrxzsxgqdvhhztwo\r\n" + 
			"sevensix833\r\n" + 
			"45\r\n" + 
			"5gnjcfour3hthree\r\n" + 
			"5three47\r\n" + 
			"nine4six8\r\n" + 
			"two84sevenmdjcvqfmjtqnine5two\r\n" + 
			"7dlrvr7jgftqp\r\n" + 
			"onehgxf9\r\n" + 
			"five713onesixsone\r\n" + 
			"6threelpchone6nineone\r\n" + 
			"qhclhsnlghnineseven3\r\n" + 
			"psgqpnbdhtj6eight2vgmbbrrzhtfxqvjxzrrdfrmvs\r\n" + 
			"qm67krpfgpqjtgfivesmjtbhfddrbvbxtnnhj4\r\n" + 
			"fivetwo4six\r\n" + 
			"spfxkx5six5\r\n" + 
			"one3pcmponehgcqqkrbplzbfivesevenhdzfcsl\r\n" + 
			"dsgklztwo35eight5gzqtrckskgspkbcz\r\n" + 
			"eight8twoonetwotwo72five\r\n" + 
			"9fiveqhhbml\r\n" + 
			"p1five6qsgjvmmqdkjspn\r\n" + 
			"9three16\r\n" + 
			"tntlhjmb8ngngvrsqtfdhghbkxt\r\n" + 
			"5483\r\n" + 
			"four79fivexgkjfs2\r\n" + 
			"2ninetwo6tpknmfrpp9\r\n" + 
			"22ncgnnmlfxgsixprr6fzrbzznsvzcn\r\n" + 
			"chzbgzh7\r\n" + 
			"threesixhfptmhfrjlgkxj4nineone\r\n" + 
			"7914\r\n" + 
			"1six2seventwo\r\n" + 
			"34one16five\r\n" + 
			"tgrlhbnq78twodbrspdkkpbrttwo3\r\n" + 
			"fiveltsrqkqcfx9nine475sixvzbng\r\n" + 
			"npdbnfiveninetmlk4lqnskpllrqbzlvb6\r\n" + 
			"vfeightwohkppsbxf2\r\n" + 
			"6qvmprfhnfs\r\n" + 
			"chcdrrkstnsmsrvjbqk1eighttwod1\r\n" + 
			"xjgsvj9dvnthx\r\n" + 
			"shsix6sevenhhqdvgsixszz9\r\n" + 
			"xjqzfhsixfhvdpxpgp7twofour\r\n" + 
			"vcsdm48tkmkt6snpdtsfbtpbchds\r\n" + 
			"3nffrsqkv7\r\n" + 
			"2jbrtfddhskblnxqxzrdbkzfkpkxdtcgxsd14\r\n" + 
			"two7773foursevenfiveggcgc\r\n" + 
			"eightone2eightkzpmrbjcr7spnhdkx\r\n" + 
			"7four1seven\r\n" + 
			"mbcrsht8hnbkmkxthreethreefive\r\n" + 
			"zlckddkg4threeonekslt\r\n" + 
			"dtdbkcjlmmlppghbg1fourfgkrsix6nvkrxbnine\r\n" + 
			"412rxhqkjrqpceight4qdzv\r\n" + 
			"eighttwo5\r\n" + 
			"ljtlkbsstwoonebbnzkxrlhsixsix57\r\n" + 
			"eightbrmhfc6zeight328jmtpnt\r\n" + 
			"4fourvxmrmrb2two\r\n" + 
			"threeone1txqngsx21zrseven\r\n" + 
			"1kpsggqxvzmrcsevenfivethree\r\n" + 
			"9lzlzlcdmcnrtwofourseven\r\n" + 
			"four4lbvcxmxf29\r\n" + 
			"6ninezkhhjj\r\n" + 
			"bngdjjdxnndzhnpfivetwo17\r\n" + 
			"blhsbxzvtncpzfour82one9oneightfzj\r\n" + 
			"cqqlvkdsf531rnvzzldbtzssxb7njhfdvc7\r\n" + 
			"six5sixsixblmnhrkx76\r\n" + 
			"four5zhscnznq3fvdgbmpvtx5\r\n" + 
			"9zoneghtsgnkn8blxcmf1four6\r\n" + 
			"threegtjftthreefive1nine4\r\n" + 
			"855ndhrqsvsnktwofphv\r\n" + 
			"fkfbsrvksixsixssix2\r\n" + 
			"five19sjvfzgrb7nhzmzfsbxbrdknvsq6\r\n" + 
			"twoqfhc4five\r\n" + 
			"sndnrlkfjqgpnn9sevenm\r\n" + 
			"bphx1cvcvdghrbbhjdzptwo\r\n" + 
			"gxthree46lbltzmv6\r\n" + 
			"fourtwo3seven\r\n" + 
			"48qfgnmnzsevenone4fourninefour\r\n" + 
			"xfztwo4pbxxnzsttwo\r\n" + 
			"jgmzslhmfkpxkfssxh2rptkvfplhldprdqmhxgdqqdpb\r\n" + 
			"jfzpsxzq1\r\n" + 
			"3vjtbdtwozdgjthqrhbcpbcjvtqbpcstqmqrmd6\r\n" + 
			"eightv2three4eightwobgq\r\n" + 
			"12jmqnmndzvnvjzcrmphnjvhnv\r\n" + 
			"onelnfnxj6six\r\n" + 
			"three723thxk63\r\n" + 
			"5nzsix5d\r\n" + 
			"seven2zpsfzbfjcmbsevenone7nhv\r\n" + 
			"sevenjlx3twoeight\r\n" + 
			"kttwone223\r\n" + 
			"1hnlbcvnkj9four\r\n" + 
			"6eight3snlrnvfctwo\r\n" + 
			"lfndkjtnpd1twonine\r\n" + 
			"xqlc6\r\n" + 
			"fdtgb9gptnkvh57sevenmtffxlc5\r\n" + 
			"three3seven48\r\n" + 
			"654\r\n" + 
			"466fzklqfourtwothreeninejhjgnqbnb\r\n" + 
			"gx3onefourfourthree6\r\n" + 
			"7one68oneff\r\n" + 
			"152nineninerpmkpv26\r\n" + 
			"ddf5\r\n" + 
			"krqlzrcqfour2\r\n" + 
			"six9fiveonechvqncsdgmvjkpgdvjdt8\r\n" + 
			"sixhmhvkrzpsfour64\r\n" + 
			"threeeight82szcqeight\r\n" + 
			"kr4five5qvndccconerjcbnvshmlfseven\r\n" + 
			"3sixczmeightwomth\r\n" + 
			"twoccnbqmnxlj6oneb\r\n" + 
			"eightsix317\r\n" + 
			"dnhccxeightfive7two\r\n" + 
			"2hpqccrxffonecrphsxttnxgnmnineqqone1\r\n" + 
			"796nineggdhfivetwocfdxq\r\n" + 
			"37bqzxkpht6gshfstzdztchjrqmsdlz\r\n" + 
			"9kphmthree9\r\n" + 
			"345oneeight\r\n" + 
			"x98eightone38fx\r\n" + 
			"769two\r\n" + 
			"hplrjxbvcbt2\r\n" + 
			"74ninetfqdtbdspjninefouronepqdhfive\r\n" + 
			"9two1qxmrgfg66mlvkl\r\n" + 
			"srjllhninecttnqj5\r\n" + 
			"6cxmnhlrkxdtwo7hd3kqpd8\r\n" + 
			"nine651xctjzpbdpb23ltn\r\n" + 
			"eightktvrj8fivel\r\n" + 
			"7hcxninesrcbdrmjzbvdrxmnfour\r\n" + 
			"sixltkxmhcvxv9pxstctcvgrfsrhdxqsix\r\n" + 
			"kscjlfmseventhree2htsixlpbvb\r\n" + 
			"5bcbhkh8fivetffq\r\n" + 
			"bsslrpbkgk4eight1vcb\r\n" + 
			"63fiverzg253four\r\n" + 
			"6seven5eight\r\n" + 
			"ninesixtwo8\r\n" + 
			"twod52seven\r\n" + 
			"52fs5\r\n" + 
			"fournine5qsc5vrvbzzkxqlthree\r\n" + 
			"6sixfive\r\n" + 
			"tnbqgfmjgglnhqd4gndbb9four\r\n" + 
			"seven37gmkmdqmkggrvkdzldgsix2hk\r\n" + 
			"1one75five4\r\n" + 
			"onellgpqghhmsnddnhgthk2four\r\n" + 
			"one5bqninelpckjbtg\r\n" + 
			"lqbssxxghpczz1sevenrrghrncbjfourhdcsns5\r\n" + 
			"t3foursevennine5nine9\r\n" + 
			"9fivefourndphjnsvxzqgfqg6\r\n" + 
			"fivekqpfhbtthreeqvcmblsxhpthreesixnine4nine\r\n" + 
			"19eightghgzbkv3xlrqncmcg\r\n" + 
			"five6fivepmjlhgdmpjvnjjpzzqctgrr\r\n" + 
			"eightstdlttjzkfive3one\r\n" + 
			"nineldnhvqqdrt2sevenqxgltrhgvtdnfcxcsknsgkzjzbvc\r\n" + 
			"6tjkxlskvg414sevenjsevenfive\r\n" + 
			"5ncdmtdhbs\r\n" + 
			"nine7onekclmqxkfdtqone3\r\n" + 
			"8zqcsnkfnsnlhfvfpxm\r\n" + 
			"six6qltwo56\r\n" + 
			"pdpcvgslddtwofour6jqjfjzvd\r\n" + 
			"vcsvxcfdgqpp3\r\n" + 
			"six9three5nineninefive37\r\n" + 
			"ztffive8\r\n" + 
			"mggphlsjczvsevenlb1sixssbdsltthreetwo\r\n" + 
			"ninedpjljc177onetwo\r\n" + 
			"two7fourvstgmr3rtlztqddmnghm\r\n" + 
			"2dgtpz521\r\n" + 
			"1ninesmsqtgzone\r\n" + 
			"ppsgnsnineninegjvpvcnp5\r\n" + 
			"ninethree7\r\n" + 
			"312cspj\r\n" + 
			"7threephmdnmnzlfpgchqfj37fqz\r\n" + 
			"5sevenhqxkqfd4cqmqhsfbhtt\r\n" + 
			"ntzgqnj5\r\n" + 
			"167\r\n" + 
			"xbpdhvfourfive7\r\n" + 
			"73kffl1one2\r\n" + 
			"fjshmr65sixrkqbtpxqnpqgjthplnlv7dfrktxvng\r\n" + 
			"eightzjzvhp12twoeight\r\n" + 
			"mgczvgctfb8tmsbtc8qtwo5\r\n" + 
			"jjpbkl67fivetmbc\r\n" + 
			"llprxv4\r\n" + 
			"two5tvc\r\n" + 
			"nine3five\r\n" + 
			"7nine2foureight338\r\n" + 
			"6vsflc\r\n" + 
			"jfgxsixzmtzjxxfc2pg7one\r\n" + 
			"dhkjgnlxd6tseven3\r\n" + 
			"zxcsrtdsjnine84sixjzcbsfneight\r\n" + 
			"hncmq88\r\n" + 
			"twofoursix1ninesvlzhpgc\r\n" + 
			"pdktnvrqqgmpllxnmp5four9\r\n" + 
			"4xckfzp\r\n" + 
			"xpckhm45\r\n" + 
			"nffone49\r\n" + 
			"8qqthrdd71two\r\n" + 
			"xksghrh7oneone245cvcnrfgtwoneq\r\n" + 
			"fivesmcb7\r\n" + 
			"mdqdktxplsqbnhztwothreetwo5czjzjsztclb4\r\n" + 
			"7two39xsmsvhqfkxgxveight\r\n" + 
			"33twotwonine\r\n" + 
			"6j\r\n" + 
			"4dfxcvdpq13mlcdsnine\r\n" + 
			"four7kcdglrh5eightzxvrrrseven\r\n" + 
			"phzqhdffour55sbd5\r\n" + 
			"5vcjmvzd1four4\r\n" + 
			"rgp1x\r\n" + 
			"four9three2twoeightvzvlpgrnine\r\n" + 
			"78pkrqbdtqzhmszzf\r\n" + 
			"sndtjtn93fivesevenvqfffjpmz54\r\n" + 
			"fvzoneightfour85threehmqdhbskvg4\r\n" + 
			"threefive2seven8eight9sevenfouroneightl\r\n" + 
			"7three68ndqdk84pm\r\n" + 
			"gponeone7zdrzgtvbv8seven\r\n" + 
			"threeseven4ndvnnkpqssfsm2rcnjbgkbtg9xp\r\n" + 
			"7threesixseven\r\n" + 
			"8two3threefivethree\r\n" + 
			"twongkzk85rteightfive\r\n" + 
			"47ninemgtknhpqqqtk9foureight\r\n" + 
			"mk2fourfive7mcqtf\r\n" + 
			"cqqxsqkx52onetwotoneeight\r\n" + 
			"3dvbblknjfnine5seven\r\n" + 
			"85dntjeightwom\r\n" + 
			"9btgrgqdkb7twonine4two5sxpqr\r\n" + 
			"1xlnnfxdsix\r\n" + 
			"1jvbhsftwocdl1hklfqlpvr6\r\n" + 
			"twop2ttjfrtrdcs\r\n" + 
			"385jtxlfdngz7rgjfour\r\n" + 
			"4ft3three65\r\n" + 
			"74dnxqvzqp85146\r\n" + 
			"nhvltrljrpfivesixthree1\r\n" + 
			"fourcbzbfr5threeeightwom\r\n" + 
			"nbnxzkgczj5\r\n" + 
			"gvcgrxfr2rnbbnsqmksrjckcg8\r\n" + 
			"four1cgrrnvt59\r\n" + 
			"sevenglsixxgnjcfstsevenoneeighteight9\r\n" + 
			"cmjbp5sixsdqbspxtbvfgxjpvb7bfsscksv\r\n" + 
			"9twodzbfqscbtthzfdf3\r\n" + 
			"ppcs59\r\n" + 
			"9sevenseven9vczdbphxxzmvskgqhzr\r\n" + 
			"321sixhczhdblvbsrtkfm8kmtjmqq\r\n" + 
			"five71\r\n" + 
			"gkfoneight5two\r\n" + 
			"tr9sixgntvrkjctnvhpbp9clnseven8\r\n" + 
			"3eightzzktskninefoursixonevfpnpqmdlhbp\r\n" + 
			"8five7k\r\n" + 
			"7threehxcgmh94fivejltrg\r\n" + 
			"5qjtxcvbtsevendpgfrcldmkkvztbhldfgtzb\r\n" + 
			"49four4\r\n" + 
			"gxhmbgjz9qfmmnb\r\n" + 
			"2ppcfjeight2\r\n" + 
			"bdjrltwoeight74kcrmjdbqkkonenine\r\n" + 
			"five6szxgtqlninefive1lbpcvg26\r\n" + 
			"3bpctmgczvvzzs7gqgg4four8\r\n" + 
			"ssd584htkgjrdfive\r\n" + 
			"9vxbsrhmcsz96\r\n" + 
			"threethree2foursix\r\n" + 
			"onefourqqxvjhbzcksixnine97eight\r\n" + 
			"fivefour3tlcfccflgkxvpksqqkc5\r\n" + 
			"sixfiveeighttwosix99dbgnf\r\n" + 
			"ninekzfzddjxn49seven\r\n" + 
			"four74znfnkzlnpz7\r\n" + 
			"7sevennine41fivevbqqqlpxcg\r\n" + 
			"fivetgr5four\r\n" + 
			"2cmcn36threeflcmzkj\r\n" + 
			"tvp23\r\n" + 
			"jz1trjfiveeightvxslxtwonine4\r\n" + 
			"dfcvmtpstrsdzs3\r\n" + 
			"qpzlmnjmzzvcvqthreeeightthree5four\r\n" + 
			"twovsdqrp4fdtgtbdhtwo\r\n" + 
			"threemkclqbksnj9\r\n" + 
			"eight5665five8sevenoneightl\r\n" + 
			"6onenzczone9p\r\n" + 
			"8three2twondcg9four\r\n" + 
			"twoxsix6rxshtslbfh\r\n" + 
			"4vpstdq2\r\n" + 
			"nine53\r\n" + 
			"6threesevennine\r\n" + 
			"jdfkb28tqnjnbpfksevenp\r\n" + 
			"29fournxtfnhqss68sevenzrmqdzqlk\r\n" + 
			"4znzlvvfs6\r\n" + 
			"gvtwone7kqsqrvknnzsfgxzfzhx\r\n" + 
			"21xpfhfjzrvtgtrkkmh9five2eight2\r\n" + 
			"9rdzsix\r\n" + 
			"gnpcgrsevenoneseven9five\r\n" + 
			"5one5seventwo7qxpgzbdtgkvtpnvclzgqqbf\r\n" + 
			"fkbfznkfcc9four3five\r\n" + 
			"xjbngj25\r\n" + 
			"8vlfour8nzftbhgxvlgskv\r\n" + 
			"eighteightvzpxmtgnlthree2ninergj\r\n" + 
			"43eight\r\n" + 
			"37twoeighteight2seventwo\r\n" + 
			"11threerfrcqrhddqczvdcfive\r\n" + 
			"ninefive7\r\n" + 
			"93fphqmdgrvjqjbpx1ctktzb\r\n" + 
			"3ninemfvthllgmbsix\r\n" + 
			"two3bbftseven76twonrdl\r\n" + 
			"435\r\n" + 
			"93threemtfpf485sixfzvgg\r\n" + 
			"three5seven3eighttwothzvxhr3nine\r\n" + 
			"qztwone167ninermd1xhpft9\r\n" + 
			"6eight1mstqgdvxznsevengdtrvtp2four\r\n" + 
			"nbfldvhzcttkninerhdrxpjffh8five6\r\n" + 
			"6sixjzlj3jpjbj16one\r\n" + 
			"onesevenfive6seven\r\n" + 
			"6ninellfhpqgrldninesixthree\r\n" + 
			"three53jcrc4\r\n" + 
			"8five9eightdgvhlktbvv\r\n" + 
			"2vllfmpnrjjjnxmmsix4kseven\r\n" + 
			"mmbdhbfqq9nine2threebshzhdknj9\r\n" + 
			"hznv78sqvxnzjppqfivesevenzskllffh\r\n" + 
			"six5vndfv9kzc36\r\n" + 
			"9fiveonefive38two3\r\n" + 
			"fgqzjqt4qkpgstlbk\r\n" + 
			"72ninefiveseven\r\n" + 
			"zzvhpbbllqpdpbsff8seven\r\n" + 
			"4jvpzjcrm8\r\n" + 
			"33one9dcppdmpcjdvssffsssb\r\n" + 
			"sevensp5fjdlmpzgtwolddrsixnlgjthree\r\n" + 
			"4twozzkckvxcfzrzctsrtwoljznhpm\r\n" + 
			"fourseven8lnnvbfb8lsptnseven\r\n" + 
			"1znsgrrnjv2eightphktgn52four\r\n" + 
			"gnttqnlvmfhrlcnineeighttwofivesixpfgfjgvckh9\r\n" + 
			"3vgkzseightthreemntsnthhpszrpkh1\r\n" + 
			"fiveddksthreeeightdbxvbfseven9six\r\n" + 
			"trtpjjrqfc6cbsccnghpthree4rxclfrkeight8\r\n" + 
			"one4sevendxdrone\r\n" + 
			"four5mttxghdqone9nvdbdnthreetwo\r\n" + 
			"sdtjdffive3sixthreeznrv\r\n" + 
			"2c3seventhreethreetwo7\r\n" + 
			"hldmdhr4\r\n" + 
			"6hcrdxpnpjblngks9\r\n" + 
			"vscjsh3sixthreefour\r\n" + 
			"threexsdhnkmdvdjthree51pone\r\n" + 
			"3onenvx53nrhnrbqtwonine\r\n" + 
			"twon67eightppqntrtct\r\n" + 
			"1onemnpcdl\r\n" + 
			"lrrzbxfrt56525three3\r\n" + 
			"fivethreevsnqxzxjdkp4nhnzsfknx6onefive\r\n" + 
			"threectkjzcm8sixvbzmqq28seven\r\n" + 
			"mjfc4gddfhszzk6two\r\n" + 
			"3twoeightfbpcsrhlm9vkxeight\r\n" + 
			"pplone5threevdvfsthree\r\n" + 
			"3sixzblcdxgrr\r\n" + 
			"3mrqceight8thtltkg6\r\n" + 
			"7six3cjznvgv1three\r\n" + 
			"tnpr1sixeightthree9eight\r\n" + 
			"ninenjbgmznt7pkfdnrffrlhkseven\r\n" + 
			"ninejnsix63779\r\n" + 
			"cljvmznmjkdjseightjrtlrmseven4nine9\r\n" + 
			"sevenfiveeightncjmffmrxcjkp5eight\r\n" + 
			"9ninefive7six\r\n" + 
			"8sevendcrffrhhjbzzmh7\r\n" + 
			"mrc168eightmvsnrqpkqd61six\r\n" + 
			"1eightcvcqqtdjg29\r\n" + 
			"znvlfrt874nine5\r\n" + 
			"7hsdnpjx4\r\n" + 
			"21kvhtmvplcb2onethree\r\n" + 
			"7nkpdjsxvkdqzjsvxmvfiveq8\r\n" + 
			"sixeighthgtxgslkhxvnlvll2nineninebnkffbbffsntrcvfdzmq\r\n" + 
			"five5nine\r\n" + 
			"hcsoneightznbfz6bbslrjphkg8\r\n" + 
			"four1lfm38\r\n" + 
			"twoninelninexptcbs3threetwoeight\r\n" + 
			"9392three4eightk9\r\n" + 
			"2xnhmqxcxxs5\r\n" + 
			"zvkfmqg2fb3rm\r\n" + 
			"3cpcvjfcngktwo\r\n" + 
			"gvnvbtvhvsmb77twoeight43\r\n" + 
			"three19nlcq\r\n" + 
			"jshvrzzseven8c2snfmnineqnbdlbr\r\n" + 
			"bvvttclxpqttwofrkpthree6seven\r\n" + 
			"ninevjnine7\r\n" + 
			"fiveqhczdqzl4seven\r\n" + 
			"84tvhrrtt5\r\n" + 
			"fourthreecmrvfonevsrsklqrrzpdp5\r\n" + 
			"knnmdlrk5threedzhdxjtseven3djbnqtfjg\r\n" + 
			"qbjkkslhb2\r\n" + 
			"two25foursix1four5\r\n" + 
			"8pbkqrmtzvzbptvj7nkdsvcpg\r\n" + 
			"k1sevenzdzbnsjscpnine2zcfhjqdtvmjnpnsix\r\n" + 
			"7rjsfmz39ctpkgnm\r\n" + 
			"4fivekjcmlxqeightfive8ninelszhv\r\n" + 
			"jsbjcvfcvlxs16twollkphts3\r\n" + 
			"8klnmlsonesix7\r\n" + 
			"lzmqtzp5six\r\n" + 
			"one7three\r\n" + 
			"3szthreesjeight14three\r\n" + 
			"cnq3seven97eightcvvbkdzbfive2\r\n" + 
			"jfive72four7\r\n" + 
			"nineqgpbdzjqfd5nvcgcm69\r\n" + 
			"jfjtrrhcgzgqgtdmdscthree8threeeightthreekvztcfnnxp\r\n" + 
			"xxfjjhvrdptwooneninebjlsgssmpsvvtwo1two\r\n" + 
			"fourz9ccjjxzmqmhm61\r\n" + 
			"sevenfzffourfivehrpjtrvglprdg4cxtcjgc\r\n" + 
			"2cp5zbl\r\n" + 
			"czhndkczznnftdh7nine\r\n" + 
			"lczpbbjnh1fourxbskj\r\n" + 
			"5sevenc3one\r\n" + 
			"1eightnqbmkhjzzxqsxn576seven\r\n" + 
			"kcxhmcnnonetwondzthz65three\r\n" + 
			"foureightfiveczzdxgdvfc6sevensrnbvhftl\r\n" + 
			"six3fourfourfourfive\r\n" + 
			"jtmrqjoneseventhreedmfpv1oneeight2\r\n" + 
			"6bslvklqfour9twofour\r\n" + 
			"threefive3\r\n" + 
			"hqjhndlzlmdtkkhlblvxs26vsnpkfjgn51three\r\n" + 
			"l286threerhscjbqts\r\n" + 
			"859gmvdrqbbr2\r\n" + 
			"748onesevenone\r\n" + 
			"9fivetwovlmdgggvss\r\n" + 
			"2mmrxstxqbtwotwoeight7\r\n" + 
			"1eightsrhkzone\r\n" + 
			"svjzgxrvcfjxp5foureightfivejlbtlmnine\r\n" + 
			"26nine7pph6h\r\n" + 
			"lprdrpvs23four8twoseven\r\n" + 
			"fivendxhlxvrmtlkmjf5nine3\r\n" + 
			"jpcnzt6fiveonetzdbmxzzrnxblb7tmvmbnine\r\n" + 
			"seventhree62\r\n" + 
			"8one5gxljlhzgb9fourfjcmbsix\r\n" + 
			"five7889onerkdxrlgrbqpb\r\n" + 
			"tlkkzfqpeight1onelvbbztlchhtrfjbdm\r\n" + 
			"jeightwo76one\r\n" + 
			"kdtxdv92321seven9jhczcl\r\n" + 
			"12cmjczrskprx9\r\n" + 
			"mmffive33eightgzczrhxpngnsixzztlrx\r\n" + 
			"pcxlcnmqr5sevenjqt5mgbgjjcpeightzdrzgnfrbjbcgc\r\n" + 
			"633bdkqk\r\n" + 
			"mfxfslmms8sixfour565\r\n" + 
			"24fivesevenmkprgbxlvzsnmn\r\n" + 
			"cqf8one\r\n" + 
			"7three8six\r\n" + 
			"9sevenpgcfrnvzzmll75one46\r\n" + 
			"1eightcbprgf\r\n" + 
			"sevenfive1sjzlnlvcksnqzlhc\r\n" + 
			"two3fivefiveonesevenoneckfcrld5\r\n" + 
			"threekxzfcxzjpfz92mltnrnntwobzhzgcg\r\n" + 
			"5fivexjsqskhdx29three267\r\n" + 
			"nine238ktdrmpkhfourbl\r\n" + 
			"9f\r\n" + 
			"vxstggkg747\r\n" + 
			"sevenjkpsmkzjrtrhcd99\r\n" + 
			"gfour96gxpchmkz\r\n" + 
			"5six42lvxfbc\r\n" + 
			"threetwothreecck34three\r\n" + 
			"2five7\r\n" + 
			"fivecgxqrcbdthree9hxbkkzsfpm7\r\n" + 
			"eightgjftmmsix3\r\n" + 
			"eighttjfpxbplxm35rrbppjfjsts\r\n" + 
			"9one3db\r\n" + 
			"4nz74six68dpfkthree\r\n" + 
			"four4five\r\n" + 
			"3fourcngqmpkdtmnvfbsevenfourl\r\n" + 
			"slvb13\r\n" + 
			"6sevenone\r\n" + 
			"eightg4qvrdkjhsbn\r\n" + 
			"three1eightthreesixfiveninesqczjcm\r\n" + 
			"jtnddjsbcseventhreenine2ninedvblpcl\r\n" + 
			"ppffnzsbmnzctdjqttrxzeightz1three\r\n" + 
			"7r\r\n" + 
			"vhksnh929sixtwobfdtmrfxbnninegtxkrnl\r\n" + 
			"zfoneight1\r\n" + 
			"9six123vcjjz\r\n" + 
			"99vknnqszvvm7\r\n" + 
			"threefour1fsxgqvcs2\r\n" + 
			"fourmssjszkkz1four6two8fhfgbkkkxfive\r\n" + 
			"4three37bx8lgkvgvjjpxzcmfvn\r\n" + 
			"twotlxxhm6four499n\r\n" + 
			"7xckrffbmzf75sevenfive3four\r\n" + 
			"2ninetljfcpnrzkh743oneightlgc\r\n" + 
			"5eightxninethreeeight4\r\n" + 
			"56threefournine\r\n" + 
			"thfc37fksgkkknfour2nine\r\n" + 
			"4jtbckvmqc\r\n" + 
			"1534\r\n" + 
			"threexcc8fourmtvkqdchjx\r\n" + 
			"3sthrzbjbxpcsdhjmfjztbgknrpb\r\n" + 
			"1fivextcmx9six\r\n" + 
			"one639lkjfive\r\n" + 
			"twovlxkxbqrjs6one1mctzqzx\r\n" + 
			"nfour1ckrgnz\r\n" + 
			"four1jsmdn\r\n" + 
			"615\r\n" + 
			"two6fourgqqz\r\n" + 
			"fqcmkbhjfntwofivenineqhqssonessvmc72\r\n" + 
			"6seveneight5rsftxhhnknjj\r\n" + 
			"threesevenfiveeightntjgpkxbmkqxhstdq6gjbzxqjsmm4\r\n" + 
			"qxnslq294gddrlkvdxqdqkcghfbgseven1\r\n" + 
			"ntdvbndqqvmhtrzvvcdlqz1\r\n" + 
			"lxkbqjcseven8eightsevenddzqsevenjst\r\n" + 
			"11vlvklqqgsxhxngseven7kljlpjfive3\r\n" + 
			"17zxn\r\n" + 
			"threeeighteight9\r\n" + 
			"onemzdc7six\r\n" + 
			"13dttxqnfdv3jhctwo\r\n" + 
			"7jxhhlxfsxzkqztwo1sevenc\r\n" + 
			"thmbtqqmtfzfnftqbsxm6eightmhffive7\r\n" + 
			"nineonebd5dfzqfpsxfour2\r\n" + 
			"4onevszfmdxmcrzmpckssixthreethreedt\r\n" + 
			"5keight7\r\n" + 
			"two9hjbcgdmone\r\n" + 
			"nine4qsf\r\n" + 
			"stwoneninefivexszrjm82seven\r\n" + 
			"92krcsixsevenznqcbdvpntbjzcbm4two\r\n" + 
			"fourfourhqeight9rbrtljfgqsixfiveflslbbxxheightwobhv\r\n" + 
			"three817seven4tstspnczkeight\r\n" + 
			"7nfd9\r\n" + 
			"threezngvkmj7mvksmsvjxjfiveeight\r\n" + 
			"9xninepctctsevensevenqqqddldd3\r\n" + 
			"kdbxsix798fvsrhvxmtwolmxpxcm8\r\n" + 
			"onefournine7\r\n" + 
			"nchnine6gtszxkhtsvzjcnmlqninevkkrvv\r\n" + 
			"8shtwopeightgbzmbbdnrtpmrl\r\n" + 
			"85sixhbfour4rldcdnqneight\r\n" + 
			"xbjhhjbk4148bmsvjz819\r\n" + 
			"7qqvmxlqzqlmrr\r\n" + 
			"one914fourfive\r\n" + 
			"eight72threenfmbfnxdhkmgjkrmsc\r\n" + 
			"eight57sixvmfjprpm\r\n" + 
			"8fpfkxffqzp8\r\n" + 
			"95hbbl29\r\n" + 
			"pzvhmkdgqp1dhsrlv78bmvhdqfcgcpdtgtpmmlnmkfive\r\n" + 
			"16onesixb68dzz\r\n" + 
			"sevenninenvmbjknplxseven57sfghptmq75\r\n" + 
			"xxztwonesixone4gczrnpzrsfqqlzseven17\r\n" + 
			"xnfive9fourlfive162\r\n" + 
			"fivercg3qkgdxpdxcpone\r\n" + 
			"sixdqkhhht46ghvd814\r\n" + 
			"zvpdmfvgxl45nine\r\n" + 
			"7four4bmjssxznnmgtlqhptcbfive\r\n" + 
			"four49nlkpfxjcnine81\r\n" + 
			"zdgtfqszsctjtvr7qqhvsninesevenxtcmdhfzxvfrtjqhzmm6\r\n" + 
			"5four2gmgmvzkvgknfpxfive\r\n" + 
			"2two1\r\n" + 
			"47eight96keightthree\r\n" + 
			"7cb\r\n" + 
			"eightdzzjjknbxv5\r\n" + 
			"dsmgfoursevengp4\r\n" + 
			"5fivethreeeightsixxqnrsfxxmjckfzhddhszqvdjr\r\n" + 
			"3jpsrxlvninefour7gtjvk\r\n" + 
			"bfdtkgfhlnkhdrpfg3\r\n" + 
			"qhzdzsix6one9one\r\n" + 
			"four75qsbtrb9mhhhhnbl\r\n" + 
			"seighthgddd275nineeighth\r\n" + 
			"ninemgsixrkmhdpjtzgfive91\r\n" + 
			"8ninetwopeightsz9\r\n" + 
			"three427c5eight\r\n" + 
			"3sixoneninefour6qksfflsvhk21\r\n" + 
			"8onex76vmhxm\r\n" + 
			"sevenkrvrdfived4six6\r\n" + 
			"rzqrxmq21\r\n" + 
			"75gszfc8vrj8\r\n" + 
			"hdgclvmgg33two\r\n" + 
			"1dv8rvdxbfjclr\r\n" + 
			"grrhjthree9fiverhqt\r\n" + 
			"6nvtzl6shxrlbmrqckseven4four\r\n" + 
			"foureight4sevenkssixhdvvbszkceightsix\r\n" + 
			"foursctcndrchdbfourtwozpdkjc3vqv\r\n" + 
			"874onethreesixtblzsnrrdvqmpgpfb\r\n" + 
			"1pgmgczsgngx\r\n" + 
			"475\r\n" + 
			"2jkfphlzqhz\r\n" + 
			"4576\r\n" + 
			"onegnbrseightptrgdfkbqdcvtwo1qbxj\r\n" + 
			"4threeznd\r\n" + 
			"8two21\r\n" + 
			"7nine8\r\n" + 
			"3seven2dbrzxbfvg4\r\n" + 
			"4937eightctmzkxkkzr\r\n" + 
			"5mtccqv2threeonetpggmmzbhlvkt\r\n" + 
			"qpjvmgqxcj2sixeight\r\n" + 
			"ttmztwozrfqhfhgkp6pltknxmcfqngh\r\n" + 
			"onegnztn9six\r\n" + 
			"6ngsnzbfvvtone27foursix2bqhbkgkr\r\n" + 
			"onejnplq3\r\n" + 
			"hmltwofivefourvjkkdjjksbdksqtnr2trxnkltgp\r\n" + 
			"one9four5mvgjgjneight\r\n" + 
			"358hxfour2\r\n" + 
			"bsmgfvnt7jlsrdvbq\r\n" + 
			"sixoneone5three8nvp7zthbv\r\n" + 
			"jmfpnrmrninesevengsqggg7\r\n" + 
			"mkvgjdjhvsevenone8eightoneightdhq\r\n" + 
			"threeccljpjhthreetwo6923znj\r\n" + 
			"1pjkbks6one35ffj\r\n" + 
			"ctpdddkxtstvzcgbfdfspbloneonethreekvsltblvhx4\r\n" + 
			"nine6zmzkjlpcsixsqt7gkbdhjqnthree\r\n" + 
			"twofive1sevenkrnfbfjpdj1ftz9\r\n" + 
			"mhfdxzqlgjfvfxvm7\r\n" + 
			"1rhznqnpgkqbtprvbb\r\n" + 
			"rhxskjqrt2onemppcsktz6\r\n" + 
			"jhxsrxzgggfivetwofourseven9\r\n" + 
			"eightnjzddrjppq51twonebtl\r\n" + 
			"2onesixonehlfmxkjpfxpkfkhbkjhcvjctfive8\r\n" + 
			"zv9three6djkfn6\r\n" + 
			"smx8\r\n" + 
			"fdrxeightj7three6dflczzmgdr\r\n" + 
			"zvzrb5twosixtwo\r\n" + 
			"993oneseven5seven\r\n" + 
			"918ninetwotwoninefivesix\r\n" + 
			"1ljpljmninefivenine7eightwolsn\r\n" + 
			"5bphjdgktwoseven4\r\n" + 
			"seven8six\r\n" + 
			"mjstvsjrltx3sevenkddd\r\n" + 
			"kljfvvmxkrkcctjpnmrveight7six\r\n" + 
			"nineeight14dkkcsvg41seven\r\n" + 
			"dvxbzxxksonefjgfppsd1eight\r\n" + 
			"sixthreeqfbone8five929\r\n" + 
			"sgktnmjjseven5\r\n" + 
			"442\r\n" + 
			"jbptworxzzmkhmszn1ninefour9\r\n" + 
			"lcfpbvkkgnggtkh8threeonefourtsvrrkcnvdpm\r\n" + 
			"81eighthgr\r\n" + 
			"jhklkvm6vqpvjdsh\r\n" + 
			"lcgjdkm5578knninezsdcp7\r\n" + 
			"sixnineeight4\r\n" + 
			"qdlpnqm7mbtgbvqznteight6fzninecrrgqsq\r\n" + 
			"tdmjfourfour8fiveseveneight\r\n" + 
			"1gdsthree\r\n" + 
			"threenine42onezctqjj8one\r\n" + 
			"ftfourone2onephv5\r\n" + 
			"nbtwonexjpnqtlck5pxmfzbvp55eightfourbxzxrrstp\r\n" + 
			"sixnine2mpcldclfvklh5kmggqbtbk\r\n" + 
			"1three4chsjrknhdtwoxqjcgssnq\r\n" + 
			"dcpjkkrthreeqpncsbfpmhtmtfvzjzmps8cltmhqzl4\r\n" + 
			"2ninelrthreethreerzxqhdpcmfthreesix\r\n" + 
			"5nfsrrh1sevenlcnrblxjhjsmdndpthreevjphjqlznd\r\n" + 
			"86kdqz8fhsxfkxvdseightmsrtrrc3\r\n" + 
			"1pmpzsjdqnm7eightfrzxtbxkdkdbzbxqlhg\r\n" + 
			"crpxxtwo7cck\r\n" + 
			"19hjngzt\r\n" + 
			"58eight3twotwo1pqr\r\n" + 
			"onegmc3three7\r\n" + 
			"eightzbchgxsdpqfivejf3eightwoflt\r\n" + 
			"nnineninetkffffblkoneseven66\r\n" + 
			"cgeightwodthree9pqkmkbbpvnthreeeight\r\n" + 
			"svjhcngvlksz4dnvfg\r\n" + 
			"twosixtfive7\r\n" + 
			"cfone9threemhvbpqrbbklfvreight6\r\n" + 
			"eighttmltbk3hgtrtb\r\n" + 
			"two6t21nineslqmt6five\r\n" + 
			"dfoneightninegrxcgjmjdqlpdjskllzpltq2jgsix4\r\n" + 
			"69threefourkqfzdpvtbxqpktwo6\r\n" + 
			"seveneight64four7\r\n" + 
			"72six4ntdhcphx48twonedbn\r\n" + 
			"tbbcskrmmj4\r\n" + 
			"xq9three28\r\n" + 
			"scq9qbtzp\r\n" + 
			"four4ccftsmnxpj95one4threeone\r\n" + 
			"gvs286jvskvvzlhc6\r\n" + 
			"nspgkhf119fdcqjtzmlqqz\r\n" + 
			"eight1zqp\r\n" + 
			"697ninenine4\r\n" + 
			"5jnnsgrhnmjmttbkql8\r\n" + 
			"seveneight5onesix9btbclcrrpzthree\r\n" + 
			"11eight5383\r\n" + 
			"9321ddslmdlb5onefgdmz\r\n" + 
			"39twozhclzjfjgseven9\r\n" + 
			"eight6tqvrfmkxmhldbvv\r\n" + 
			"twogrldddksg1seven8\r\n" + 
			"seven22dgjzqdlmmfvtxnnglqxbgfhgvglrg1\r\n" + 
			"oner676pkkmninegff\r\n" + 
			"3lvkxfive15qthpfivethree\r\n" + 
			"fiveseventhree2llxsgzeight\r\n" + 
			"four3jftmvmqzql8nscjvph1seventhree5\r\n" + 
			"4chjvrninefour\r\n" + 
			"4ninenine46\r\n" + 
			"sevennine7cgdnx\r\n" + 
			"7mfqtmpbnine\r\n" + 
			"38threefivebjjpgj\r\n" + 
			"kn4lpfd1four\r\n" + 
			"nine89krvcbcvqn\r\n" + 
			"2four62\r\n" + 
			"8onehrrhxpmlpnfqtlxmfzps\r\n" + 
			"vzoneight2gkpfczjmht5zlfxmnkjfq\r\n" + 
			"mpdone5\r\n" + 
			"nv3ninetwo\r\n" + 
			"mteightwot4sixfivefive2threesix9\r\n" + 
			"httwone2threefiveone3\r\n" + 
			"one9kphlcksfournrkxktxvz9bkfnq\r\n" + 
			"foursixone8\r\n" + 
			"66crcjonetwo\r\n" + 
			"bcrsltzkd64eightcjzmctwoseven\r\n" + 
			"rplxlbpddneightvqdclxqqlh3hlkhkgrfvlnine\r\n" + 
			"sixdjdhcvvnnccpsevenkhvqp1\r\n" + 
			"qjsevennineeight7three7four\r\n" + 
			"three5one2pzgbnmj1\r\n" + 
			"2kbbhjmseven464\r\n" + 
			"eightseventhree3onevkmhmjvcd\r\n" + 
			"2rxdcjpzkph\r\n" + 
			"two9sevenpbhcbklcpnsixthree\r\n" + 
			"seven9sevensix4zklllpckrxrcpctlgt\r\n" + 
			"5fivefiven6\r\n" + 
			"2fjffivesixgeightthree\r\n" + 
			"seven4pp5tpmcfourone\r\n" + 
			"kftkjnhnms5hbngpqhxcone\r\n" + 
			"1dnrrsevenseven\r\n" + 
			"fhjcmxvpbsr99\r\n" + 
			"seven41threeckvp\r\n" + 
			"15twothree\r\n" + 
			"529two\r\n" + 
			"xhtmrmdzkgsevenfkkzmqpgoneqqzdhpbdeight9\r\n" + 
			"ttnzmptlskm5pzvdnc15sqqcmmvx4\r\n" + 
			"7ndb\r\n" + 
			"55bxxpvjhkqdsixfour\r\n" + 
			"14twochvtxrdcslbsrggcxvjpg\r\n" + 
			"2seventhree\r\n" + 
			"9cgfnrxprbz2ninejrhbgsczrhlxn6\r\n" + 
			"tfljdjcpltgzhmxv9\r\n" + 
			"71ctrzxbkhhqpgc\r\n" + 
			"two1threeeightrskmzsmzhcdbxp2pztmgcg\r\n" + 
			"7eight6934\r\n" + 
			"five7lgspjnhrsmvmeightwolj\r\n" + 
			"vtqcrtjmtkmvvnmmnineone87kclsrqrf\r\n" + 
			"5fivetslmronefdsdxr\r\n" + 
			"seven88\r\n" + 
			"gsvbn9fourtwo4zthfive\r\n" + 
			"nqkgjlqgqbng5rxzbkhzmzcgkrsblfnqstxlcg\r\n" + 
			"9znzctbdftwonineone\r\n" + 
			"mrngnmkdjv48sevenvprcvllqqone\r\n" + 
			"ninecxctvm5four621blbfctsg2\r\n" + 
			"seven6threehzhbmbthree2\r\n" + 
			"3fivethree\r\n" + 
			"sfsncqnp34twoxdmninenqqhdfour\r\n" + 
			"four7gbcslngdx385lhkslcjhq5qjmvchc\r\n" + 
			"five4hnnkk31four\r\n" + 
			"7three8fivethree7onethree\r\n" + 
			"sjqpktfsn3tdjflb2\r\n" + 
			"1ninegnone\r\n" + 
			"rvgcmzhffrntqqnhjxtxqrmvbsrteight34\r\n" + 
			"7slcmpmvhfhpzgllr5ktnzm7onevznhnnbrcc\r\n" + 
			"269four1bzjrmheight3fgcr\r\n" + 
			"9seventhreefourzlqgjnrmq7xcmntjncntsixthlgq\r\n" + 
			"seveneight19fbphndppb8twonebbj\r\n" + 
			"eightxblvnvrtpsmcngtbtltwo6heightprccv\r\n" + 
			"sixeightsix32\r\n" + 
			"49six7twonine2five\r\n" + 
			"25five5\r\n" + 
			"42onetwonbl\r\n" + 
			"kbhrtpgnp6\r\n" + 
			"nsfktqkbzdcmgf28\r\n" + 
			"btwoeight982nine\r\n" + 
			"cpcrbqzmkbtcjmn58six\r\n" + 
			"one3hlgmgphkcnp\r\n" + 
			"74zpbzmxc\r\n" + 
			"eightsevenseven36gdcnmrxn6vhvkmc5\r\n" + 
			"1nineninehkrsix\r\n" + 
			"threeqloneseven1\r\n" + 
			"eighthhq9cbptsljhzsevenhzpxm\r\n" + 
			"8oneonebdthldf6eightthree\r\n" + 
			"7onefxlhzxcmhc4five8eightjlcms\r\n" + 
			"48skgslmflkhnpqtsix\r\n" + 
			"rgrdzx4sevenfive\r\n" + 
			"onefxfxhslc9hjxkdqjs6threenine\r\n" + 
			"fivesevenonethree2sjnvt5\r\n" + 
			"92fivel83\r\n" + 
			"three2fivenlbtvsmvsix\r\n" + 
			"threefive8nine\r\n" + 
			"mjnchtwosdbh7292three\r\n" + 
			"hdqffzseven3sevencqv\r\n" + 
			"73xcqzdt7jvkkskpgnine5\r\n" + 
			"2threeninessgntvctkns2kqmcqdvjt\r\n" + 
			"dktgqszxcptlpxpzlsix8onetwoqlxk\r\n" + 
			"pbvvfjlzbseven2\r\n" + 
			"qtlfxzplrrcjfr6nine\r\n" + 
			"7gsthreeplhxbbmrhtnine53rxpjghgjq\r\n" + 
			"2bmmjrzzjnz9dfplppnjmktzcsixrpqxcptskjkfqxgx\r\n" + 
			"fivedrtnxnjqxnt2qtbvlj\r\n" + 
			"j88ninelnjlsnzsqk31rg\r\n" + 
			"hcfxflqvkvdfmthkjdpfzzlzzh4kdmmhvspzddfivethree\r\n" + 
			"5qsl\r\n" + 
			"9eight3sixxvjktfzbpglmzfour37\r\n" + 
			"4six2\r\n" + 
			"zqrlljptwoone5knbhf72six6\r\n" + 
			"5k65blpldztzjh7sghcsdnpm8\r\n" + 
			"six48\r\n" + 
			"skdpdfqtglzvlpqxp3twonelcr\r\n" + 
			"twoklhndseven6jdhcsccjgp68twonelb\r\n" + 
			"76four7nineeight\r\n" + 
			"gntwoc59fivesevenninefour\r\n" + 
			"1nine64seven8\r\n" + 
			"seven4926four\r\n" + 
			"31gsjtkjdvjdqnrsgnpbnxsdrzmtskfdqhd\r\n" + 
			"seven82ninetfnxhlxeightbt9\r\n" + 
			"xttqntsdmvfour8two\r\n" + 
			"zbjbeightfhbhcfkbhrthqhgsixthree11five\r\n" + 
			"5sixpfnpmcpfppxvsfprxfbfcsevenfour\r\n" + 
			"25fourthreexgvhzdkzfh\r\n" + 
			"4xdpdpkldnbone\r\n" + 
			"98sevendhjzlddn5ninetwobrfmbshn\r\n" + 
			"7783twonineeight\r\n" + 
			"1fourfour\r\n" + 
			"4fourztnthreeone8mqmdfour\r\n" + 
			"fbfvqgvqfone5nctdcdpteighttwo\r\n" + 
			"dhfbhone4fourlgzftg\r\n" + 
			"";
	
	public final static String[] DAY_ONE_INPUT_SEP = DAY_ONE_INPUT.split("\n");
	
	public static void main(final String[] args) {
		System.out.println("Part 1: : " + Day1.part1(DAY_ONE_INPUT_SEP));
		System.out.println("Part 2: : " + Day1.part2(DAY_ONE_INPUT_SEP));
	}
	
	
}
