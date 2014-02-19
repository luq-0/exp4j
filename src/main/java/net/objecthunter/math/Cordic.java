package net.objecthunter.math;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

import javax.print.attribute.standard.PresentationDirection;

public class Cordic {
	// in GNU octae this table can be generated using the command
	// "printf("%.34f\n", cumprod(1./sqrt(1.+2.^-(2.*i))))"
	public static BigDecimal K[] = new BigDecimal[]{
			new BigDecimal("0.7071067811865474617150084668537602",
					MathContext.DECIMAL128),
			new BigDecimal("0.6324555320336757713306496953009628",
					MathContext.DECIMAL128),
			new BigDecimal("0.6135719910778962837838435007142834",
					MathContext.DECIMAL128),
			new BigDecimal("0.6088339125177524291387953780940734",
					MathContext.DECIMAL128),
			new BigDecimal("0.6076482562561682509993943313020281",
					MathContext.DECIMAL128),
			new BigDecimal("0.6073517701412960434481647098436952",
					MathContext.DECIMAL128),
			new BigDecimal("0.6072776440935261366149688910809346",
					MathContext.DECIMAL128),
			new BigDecimal("0.6072591122988928447057332959957421",
					MathContext.DECIMAL128),
			new BigDecimal("0.6072544793325624912228022367344238",
					MathContext.DECIMAL128),
			new BigDecimal("0.6072533210898752864537186724191997",
					MathContext.DECIMAL128),
			new BigDecimal("0.6072530315291344571448917122324929",
					MathContext.DECIMAL128),
			new BigDecimal("0.6072529591389449477034645497042220",
					MathContext.DECIMAL128),
			new BigDecimal("0.6072529410413972650317759871541057",
					MathContext.DECIMAL128),
			new BigDecimal("0.6072529365170102888527026152587496",
					MathContext.DECIMAL128),
			new BigDecimal("0.6072529353859135170523586566559970",
					MathContext.DECIMAL128),
			new BigDecimal("0.6072529351031393796134238982631359",
					MathContext.DECIMAL128),
			new BigDecimal("0.6072529350324458174981145930360071",
					MathContext.DECIMAL128),
			new BigDecimal("0.6072529350147723992137116511003114",
					MathContext.DECIMAL128),
			new BigDecimal("0.6072529350103540446426109156163875",
					MathContext.DECIMAL128),
			new BigDecimal("0.6072529350092494837554113473743200",
					MathContext.DECIMAL128),
			new BigDecimal("0.6072529350089733712891870709427167",
					MathContext.DECIMAL128),
			new BigDecimal("0.6072529350089043154170553862059023",
					MathContext.DECIMAL128),
			new BigDecimal("0.6072529350088871069601736962795258",
					MathContext.DECIMAL128),
			new BigDecimal("0.6072529350088827770903776581690181",
					MathContext.DECIMAL128),
			new BigDecimal("0.6072529350088816668673530330124777",
					MathContext.DECIMAL128),
			new BigDecimal("0.6072529350088814448227481079811696",
					MathContext.DECIMAL128)};

	// In GNU octave this table is generated using this command:
	// printf("%.34f\n",atan(2.^-(0:40)))
	public static BigDecimal A[] = new BigDecimal[]{
			new BigDecimal(
					"0.78539816339744830961566084581987572104929234984377645524373614807695410157155224",
					MathContext.DECIMAL128),
			new BigDecimal(
					"0.4636476090008061162142562314612144020285370542861202638109330887201978641657417",
					MathContext.DECIMAL128),
			new BigDecimal(
					"0.24497866312686415417208248121127581091414409838118406712737591466735511958764209",
					MathContext.DECIMAL128),
			new BigDecimal(
					"0.12435499454676143503135484916387102557317019176980408991511411911572226742756675",
					MathContext.DECIMAL128),
			new BigDecimal(
					"0.06241880999595734847397911298550511360627388779749919460752781689869026721680345",
					MathContext.DECIMAL128),
			new BigDecimal(
					"0.03123983343026827625371174489249097703249566372540004025531558625579642101943244",
					MathContext.DECIMAL128),
			new BigDecimal(
					"0.01562372862047683080280152125657031891111413980090541788141050739666477417640177",
					MathContext.DECIMAL128),
			new BigDecimal(
					"0.00781234106010111129646339184219928162122281172501472355745390224838987204533523",
					MathContext.DECIMAL128),
			new BigDecimal(
					"0.00390623013196697182762866531142438714035749011520285621521309514901134416395438",
					MathContext.DECIMAL128),
			new BigDecimal(
					"0.00195312251647881868512148262507671393161074677723351033905753396043108530313709",
					MathContext.DECIMAL128),
			new BigDecimal(
					"0.00097656218955931943040343019971729085163419701581008759004900725226763752035508",
					MathContext.DECIMAL128),
			new BigDecimal(
					"0.00048828121119489827546923962564484866619236113313500303710940335348751213674327",
					MathContext.DECIMAL128),
			new BigDecimal(
					"0.00024414062014936176401672294325965998621241779097061761180790046091017847021746",
					MathContext.DECIMAL128),
			new BigDecimal(
					"0.00012207031189367020423905864611795630093082940901578749845193983784664259022045",
					MathContext.DECIMAL128),
			new BigDecimal(
					"6.1035156174208775021662569173829153785143536833346179337671134316586565776889807e-5",
					MathContext.DECIMAL128),
			new BigDecimal(
					"3.0517578115526096861825953438536019750949675119437837531021156883611630486111094e-5",
					MathContext.DECIMAL128),
			new BigDecimal(
					"1.525878906131576210723193581269788513742923814457587484624118640744586426707683e-5",
					MathContext.DECIMAL128),
			new BigDecimal(
					"7.629394531101970263388482340105090586350743918468077157763830696533368540109726e-6",
					MathContext.DECIMAL128),
			new BigDecimal(
					"3.814697265606496282923075616372993722805257303968866310187439250393888463610412e-6",
					MathContext.DECIMAL128),
			new BigDecimal(
					"1.907348632810187035365369305917244168714342165450153366670057723467064463709843e-6",
					MathContext.DECIMAL128),
			new BigDecimal(
					"9.53674316405960879420670689923112390019634124498790160133611802076003329888112e-7",
					MathContext.DECIMAL128),
			new BigDecimal(
					"4.7683715820308885992758382144924707587049404378664196740053215887142363814443e-7",
					MathContext.DECIMAL128),
			new BigDecimal(
					"2.3841857910155798249094797721893269783096898769063155913766911372217648282103e-7",
					MathContext.DECIMAL128),
			new BigDecimal(
					"1.19209289550780685311368497137922112645967587664586735576738225215437199588955e-7",
					MathContext.DECIMAL128),
			new BigDecimal(
					"5.9604644775390554413921062141788874250030195782366297314294565710005108461658e-8",
					MathContext.DECIMAL128),
			new BigDecimal(
					"2.9802322387695303676740132767709503349043907067445107249258477840843557260847e-8",
					MathContext.DECIMAL128),
			new BigDecimal(
					"1.4901161193847655147092516595963247108248930025964720012170057805491014206727e-8",
					MathContext.DECIMAL128),
			new BigDecimal(
					"7.4505805969238279871365645744953921132066925545665870075947601416173711836981947e-9",
					MathContext.DECIMAL128),
			new BigDecimal(
					"3.7252902984619140452670705718119235836719483287370405242319982692391073974358196e-9",
					MathContext.DECIMAL128),
			new BigDecimal(
					"1.8626451492309570290958838214764904345065282835738863513491050124951302594430928e-9",
					MathContext.DECIMAL128),
			new BigDecimal(
					"9.313225746154785153557354776845613038929264961492906739437685424219745532957262e-10",
					MathContext.DECIMAL128),
			new BigDecimal(
					"4.656612873077392577788419347105701629734786389156161742132349255441464969391566e-10",
					MathContext.DECIMAL128),
			new BigDecimal(
					"2.328306436538696289020427418388212703712742932049818605254866622806071463876315e-10",
					MathContext.DECIMAL128),
			new BigDecimal(
					"1.164153218269348144525990927298526587963964573800142900265849791708846857314265e-10",
					MathContext.DECIMAL128),
			new BigDecimal(
					"5.82076609134674072264967615912315823495491562577952724239762061671471623655995e-11",
					MathContext.DECIMAL128),
			new BigDecimal(
					"2.91038304567337036132730326989039477936936320036398304958299345250291480963431e-11",
					MathContext.DECIMAL128),
			new BigDecimal(
					"1.45519152283668518066395978373629934742117036089367107320672702133070941642532e-11",
					MathContext.DECIMAL128),
			new BigDecimal(
					"7.27595761418342590332018410467037418427646293888214296401117528908389857511e-12",
					MathContext.DECIMAL128),
			new BigDecimal(
					"3.6379788070917129516601402005837967730345578669779258118296083646485740987638e-12",
					MathContext.DECIMAL128),
			new BigDecimal(
					"1.8189894035458564758300761188229745966293197333602925371452076535033553005523e-12",
					MathContext.DECIMAL128),
			new BigDecimal(
					"9.0949470177292823791503881172787182457866496666966318622647928818549076982886781e-13",
					MathContext.DECIMAL128)
	};

	static {
		for (BigDecimal b: A) {
			System.out.println(b);
		}
	}
	
	public static BigDecimal[] apply(BigDecimal arg, MathContext mc) {
		// TODO: reduce the arg to 0 <= arg <= 2*pi

		if (arg.compareTo(BigDecimal.ZERO) == 0) {
			return new BigDecimal[]{BigDecimal.ONE, BigDecimal.ZERO};
		}

		if (arg.compareTo(new BigDecimal(Math.PI)) == 0) {
			return new BigDecimal[]{BigDecimal.ONE.negate(), BigDecimal.ZERO};
		}

		if (arg.compareTo(new BigDecimal(2 * Math.PI)) == 0) {
			return new BigDecimal[]{BigDecimal.ONE, BigDecimal.ZERO};
		}

		if (arg.compareTo(new BigDecimal(Math.PI / 2d)) == 0) {
			return new BigDecimal[]{BigDecimal.ZERO, BigDecimal.ONE};
		}

		if (arg.compareTo(new BigDecimal(3d * Math.PI / 2d)) == 0) {
			return new BigDecimal[]{BigDecimal.ZERO, BigDecimal.ONE.negate()};
		}

		int i = 0;
		BigDecimal beta = arg;
		BigDecimal sigma;
		BigDecimal factor;
		BigDecimal powerOfTwo = BigDecimal.ONE;
		BigDecimal x = BigDecimal.ONE;
		BigDecimal y = BigDecimal.ZERO;
		BigDecimal angle = A[0];
		BigDecimal two = BigDecimal.ONE.add(BigDecimal.ONE);
		BigDecimal precision = new BigDecimal(BigInteger.ONE,
				mc.getPrecision() * 2);
		BigDecimal tmpx;
		BigDecimal tmpy;
		for (; i < Integer.MAX_VALUE; i++) {
			if (beta.compareTo(BigDecimal.ZERO) < 0) {
				sigma = BigDecimal.ONE.negate();
			} else {
				sigma = BigDecimal.ONE;
			}
			factor = sigma.multiply(powerOfTwo, mc);
			tmpx = x.subtract(y.multiply(factor, mc), mc);
			tmpy = y.add(x.multiply(factor, mc), mc);
			x = tmpx;
			y = tmpy;
			beta = beta.subtract(sigma.multiply(angle, mc), mc);
			powerOfTwo = powerOfTwo.divide(two, mc);
			if (i + 2 > A.length) {
				angle = angle.divide(two);
			} else {
				angle = A[i + 1];
			}
			if (beta.abs().compareTo(precision) < 0) {
				i++;
				System.out.println("breaking after " + i
						+ "iterations with beta = " + beta);
				break;
			}
		}
		return new BigDecimal[]{x.multiply(K[Math.min(K.length - 1, i)], mc),
				y.multiply(K[Math.min(K.length - 1, i)], mc)};
	}

	public static BigDecimal cos(BigDecimal arg, MathContext mc) {
		return apply(arg, mc)[0];
	}

	public static BigDecimal sin(BigDecimal arg, MathContext mc) {
		return apply(arg, mc)[1];
	}
}
