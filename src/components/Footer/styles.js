import { Dimensions, StyleSheet } from "react-native";
import { theme } from "../../styles/theme";

export const styles = StyleSheet.create({
  footer: {
    alignItems: 'center',
    flexDirection: 'row',
    justifyContent: 'space-around',
    backgroundColor: theme.colors.darkBlue,
    width: '100%',
    height: Dimensions.get('window').height * 0.08,
  }
});